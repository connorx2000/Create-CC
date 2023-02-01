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

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            CreateCC.MOD_ID);

    //HYDROCHLORIC ACID
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

    //SUGAR WATER
    public static final RegistryObject<FlowingFluid> SOURCE_SUGAR_WATER = FLUIDS.register(
            "sugar_water_fluid",
            () -> new SugarWaterFluid.Source(ModFluids.SUGAR_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SUGAR_WATER = FLUIDS.register(
            "flowing_sugar_water",
            () -> new SugarWaterFluid.Flowing(ModFluids.SUGAR_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SUGAR_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SUGAR_WATER_FLUID_TYPE, SOURCE_SUGAR_WATER,
            FLOWING_SUGAR_WATER).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.SUGAR_WATER_BLOCK).bucket(ModItems.SUGAR_WATER_BUCKET);

    //SWEET BERRY WATER
    public static final RegistryObject<FlowingFluid> SOURCE_SWEET_BERRY_WATER = FLUIDS.register(
            "sweet_berry_water_fluid",
            () -> new SugarWaterFluid.Source(ModFluids.SWEET_BERRY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SWEET_BERRY_WATER = FLUIDS.register(
            "flowing_sweet_berry_water",
            () -> new SugarWaterFluid.Flowing(ModFluids.SWEET_BERRY_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SWEET_BERRY_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SWEET_BERRY_WATER_FLUID_TYPE, SOURCE_SWEET_BERRY_WATER,
            FLOWING_SWEET_BERRY_WATER).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.SWEET_BERRY_WATER_BLOCK).bucket(ModItems.SWEET_BERRY_WATER_BUCKET);

    //SWEET BERRY CONCENTRATE

    public static final RegistryObject<FlowingFluid> SOURCE_SWEET_BERRY_CONCENTRATE = FLUIDS.register(
            "sweet_berry_concentrate_fluid",
            () -> new SyrupFluid.Source(ModFluids.SWEET_BERRY_CONCENTRATE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SWEET_BERRY_CONCENTRATE = FLUIDS.register(
            "flowing_sweet_berry_concentrate",
            () -> new SyrupFluid.Flowing(ModFluids.SWEET_BERRY_CONCENTRATE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SWEET_BERRY_CONCENTRATE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SWEET_BERRY_CONCENTRATE_FLUID_TYPE, SOURCE_SWEET_BERRY_CONCENTRATE,
            FLOWING_SWEET_BERRY_CONCENTRATE).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.SWEET_BERRY_CONCENTRATE_BLOCK).bucket(ModItems.SWEET_BERRY_CONCENTRATE_BUCKET);

    // COLA SYRUP

    public static final RegistryObject<FlowingFluid> SOURCE_COLA_SYRUP = FLUIDS.register(
            "cola_syrup_fluid",
            () -> new SyrupFluid.Source(ModFluids.COLA_SYRUP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_COLA_SYRUP = FLUIDS.register(
            "flowing_cola_syrup",
            () -> new SyrupFluid.Flowing(ModFluids.COLA_SYRUP_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties COLA_SYRUP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.COLA_SYRUP_FLUID_TYPE, SOURCE_COLA_SYRUP,
            FLOWING_COLA_SYRUP).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.COLA_SYRUP_BLOCK).bucket(ModItems.COLA_SYRUP_BUCKET);

    //COCA COLA FLUID

    public static final RegistryObject<FlowingFluid> SOURCE_COCA_COLA = FLUIDS.register(
            "coca_cola_fluid",
            () -> new ColaFluid.Source(ModFluids.COCA_COLA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_COCA_COLA = FLUIDS.register(
            "coca_cola_syrup",
            () -> new ColaFluid.Flowing(ModFluids.COCA_COLA_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties COCA_COLA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.COCA_COLA_FLUID_TYPE, SOURCE_COCA_COLA,
            FLOWING_COCA_COLA).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.COCA_COLA_BLOCK).bucket(ModItems.COCA_COLA_BUCKET);

    // SWEET BERRY COLA

    public static final RegistryObject<FlowingFluid> SOURCE_SWEET_BERRY_COLA = FLUIDS.register(
            "sweet_berry_cola_fluid",
            () -> new ColaFluid.Source(ModFluids.SWEET_BERRY_COLA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SWEET_BERRY_COLA = FLUIDS.register(
            "sweet_berry_cola_syrup",
            () -> new ColaFluid.Flowing(ModFluids.SWEET_BERRY_COLA_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SWEET_BERRY_COLA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SWEET_BERRY_COLA_FLUID_TYPE, SOURCE_SWEET_BERRY_COLA,
            FLOWING_SWEET_BERRY_COLA).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.SWEET_BERRY_COLA_BLOCK).bucket(ModItems.SWEET_BERRY_COLA_BUCKET);
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
