package net.connor.createcc.mixin;

import net.connor.createcc.CreateCC;
import net.connor.createcc.fluid.FluidSwimmingSounds;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Map;

@Mixin(Entity.class)
public class EntityMixin {
    private final Map<FluidType, Boolean> wasTouchingFluid = new HashMap<>();

    @Inject(method = "move", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;isInWater()Z"))
    private void createcc$move(MoverType moverType, Vec3 moveVec, CallbackInfo callback) {
        Entity entity = (Entity) (Object) this;

        Entity movingEntity = entity.isVehicle() && entity.getControllingPassenger() != null ? entity.getControllingPassenger() : entity;
        float distAmp = movingEntity == entity ? 0.35F : 0.4F;
        Vec3 movement = movingEntity.getDeltaMovement();

        float volume = Math.min(1.0F, (float) Math.sqrt(
                movement.x * movement.x * (double) 0.2F + movement.y * movement.y + movement.z * movement.z * (double) 0.2F) * distAmp);

        FluidSwimmingSounds.iterate(entry -> {
            if (entity.isInFluidType(entry.getKey().get())) {
                float pitch = 1.0F + (entity.level.random.nextFloat() - entity.level.random.nextFloat()) * 0.4F;
                movingEntity.playSound(entry.getValue().getSwimSound(), volume, pitch);
            }
        });
    }

    @Inject(method = "baseTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;updateInWaterStateAndDoFluidPushing()Z", shift = At.Shift.AFTER))
    private void createcc$baseTick(CallbackInfo callback) {
        Entity entity = (Entity) (Object) this;

        Entity movingEntity = entity.isVehicle() && entity.getControllingPassenger() != null ? entity.getControllingPassenger() : entity;
        Vec3 movement = movingEntity.getDeltaMovement();

        float distAmp = movingEntity == entity ? 0.2F : 0.9F;
        float volume = Math.min(1.0F, (float) Math.sqrt(
                movement.x * movement.x * (double) 0.2F + movement.y * movement.y + movement.z * movement.z * (double) 0.2F) * distAmp);

        FluidSwimmingSounds.iterate(entry -> {
            if (entity.isInFluidType(entry.getKey().get())) {
                if (!this.wasTouchingFluid.getOrDefault(entry.getKey().get(), false)) {
                    float pitch = 1.0F + (entity.level.random.nextFloat() - entity.level.random.nextFloat()) * 0.4F;

                    if (volume < 0.25F) {
                        movingEntity.playSound(entry.getValue().getSplashSound(), volume, pitch);
                    } else {
                        movingEntity.playSound(entry.getValue().getHighSpeedSplashSound(), volume, pitch);
                    }

                    this.wasTouchingFluid.put(entry.getKey().get(), true);
                }
            } else if (!entity.isInFluidType(entry.getKey().get()) && this.wasTouchingFluid.getOrDefault(
                    entry.getKey().get(), false)) {
                this.wasTouchingFluid.put(entry.getKey().get(), false);
            }
        });
    }
}
