package net.connor.createcc.fluid;

import net.connor.createcc.CreateCC;
import net.connor.createcc.block.ModBlocks;
import net.connor.createcc.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateCC.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROCHLORIC_ACID = FLUIDS.register("hydrochloric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HYDROCHLORIC_ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROCHLORIC_ACID = FLUIDS.register("flowing_hydrochloric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HYDROCHLORIC_ACID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties HYDROCHLORIC_ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.HYDROCHLORIC_ACID_FLUID_TYPE, SOURCE_HYDROCHLORIC_ACID, FLOWING_HYDROCHLORIC_ACID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.HYDROCHLORIC_ACID_BLOCK)
            .bucket(ModItems.HYDROCHLORIC_ACID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
