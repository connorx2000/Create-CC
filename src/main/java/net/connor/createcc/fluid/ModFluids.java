package net.connor.createcc.fluid;

import net.connor.createcc.CreateCC;
import net.connor.createcc.block.ModBlocks;
import net.connor.createcc.item.ModItems;
import net.connor.createcc.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            CreateCC.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROCHLORIC_ACID = FLUIDS.register(
            "hydrochloric_acid_fluid",
            () -> new HydrochloricAcidFluid.Source(ModFluids.HYDROCHLORIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROCHLORIC_ACID = FLUIDS.register(
            "flowing_hydrochloric_acid",
            () -> new HydrochloricAcidFluid.Flowing(ModFluids.HYDROCHLORIC_ACID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties HYDROCHLORIC_ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.HYDROCHLORIC_ACID_FLUID_TYPE, SOURCE_HYDROCHLORIC_ACID,
            FLOWING_HYDROCHLORIC_ACID).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.HYDROCHLORIC_ACID_BLOCK).bucket(ModItems.HYDROCHLORIC_ACID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
