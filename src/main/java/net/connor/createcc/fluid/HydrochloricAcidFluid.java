package net.connor.createcc.fluid;

import net.connor.createcc.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.jetbrains.annotations.NotNull;

public abstract class HydrochloricAcidFluid extends ForgeFlowingFluid {
    protected HydrochloricAcidFluid(Properties properties) {
        super(properties);
    }

    @Override
    public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity) {
        entity.hurt(DamageSource.GENERIC, 1);
        return super.move(state, entity, movementVector, gravity);
    }

    public static class Source extends HydrochloricAcidFluid {
        public Source(Properties properties) {
            super(properties);
        }

        @Override
        public int getAmount(@NotNull FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(@NotNull FluidState state) {
            return true;
        }
    }

    public static class Flowing extends HydrochloricAcidFluid {
        public Flowing(@NotNull Properties properties) {
            super(properties);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        @Override
        protected void createFluidStateDefinition(StateDefinition.@NotNull Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(@NotNull FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(@NotNull FluidState state) {
            return false;
        }

        @Override
        protected void animateTick(Level pLevel, BlockPos pPos, FluidState pState, RandomSource pRandom) {
            if (pRandom.nextInt(64) == 0) {
                pLevel.playLocalSound(pPos.getX(), pPos.getY(), pPos.getZ(), ModSounds.HYDROCHLORIC_ACID_AMBIENT.get(),
                        SoundSource.BLOCKS, 1, 1, false);
            }
        }
    }
}
