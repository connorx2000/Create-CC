package net.connor.createcc.fluid;

import com.mojang.math.Vector3f;
import net.connor.createcc.CreateCC;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation HYDROCHLORIC_ACID_OVERLAY_RL = new ResourceLocation(CreateCC.MOD_ID, "misc/in_hydrochloric_acid");


    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateCC.MOD_ID);


    //HYDROCHLORIC ACID
    public static final RegistryObject<FluidType> HYDROCHLORIC_ACID_FLUID_TYPE = hydrochloric("hydrochloric_acid_fluid_type",
            FluidType.Properties.create()
                    .lightLevel(1)
                    .density(15)
                    .viscosity(5));

    //SUGAR WATER
    public static final RegistryObject<FluidType> SUGAR_WATER_FLUID_TYPE = sugarwater("sugar_water_fluid_type",
            FluidType.Properties.create()
                    .density(15)
                    .viscosity(5));

    //SWEET BERRY WATER
    public static final RegistryObject<FluidType> SWEET_BERRY_WATER_FLUID_TYPE = sweetberry("sweet_berry_water_fluid_type",
            FluidType.Properties.create()
                    .density(15)
                    .viscosity(5));

    //SWEET BERRY CONCENTRATE
    public static final RegistryObject<FluidType> SWEET_BERRY_CONCENTRATE_FLUID_TYPE = berryconcentrate("sweet_berry_concentrate_fluid_type",
            FluidType.Properties.create()
                    .density(60)
                    .viscosity(200));

    // COLA SYRUP
    public static final RegistryObject<FluidType> COLA_SYRUP_FLUID_TYPE =colasyrup("cola_syrup_fluid_type",
            FluidType.Properties.create()
                    .density(60)
                    .viscosity(200));

    // COCA COLA
    public static final RegistryObject<FluidType> COCA_COLA_FLUID_TYPE = cocacola("coca_cola_fluid_type",
            FluidType.Properties.create()
                    .density(30)
                    .viscosity(50));

    // SWEET BERRY COLA
    public static final RegistryObject<FluidType> SWEET_BERRY_COLA_FLUID_TYPE = berrycola("sweet_berry_cola_fluid_type",
            FluidType.Properties.create()
                    .density(30)
                    .viscosity(50));


    private static RegistryObject<FluidType> hydrochloric(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFE9F0F1, new Vector3f(233f / 255f, 240f / 255f, 241f / 255f), properties));
    }

    private static RegistryObject<FluidType> sugarwater(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFDEF9FC, new Vector3f(222f / 255f, 249f / 255f, 252f / 255f), properties));
    }

    private static RegistryObject<FluidType> sweetberry(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFF9B8B8, new Vector3f(249f / 255f, 184f / 255f, 184f / 255f), properties));
    }

    private static RegistryObject<FluidType> berryconcentrate(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFF15555, new Vector3f(241f / 255f, 85f / 255f, 85f / 255f), properties));
    }

    private static RegistryObject<FluidType> colasyrup(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFF683F12, new Vector3f(104f / 255f, 63f / 255f, 18f / 255f), properties));
    }

    private static RegistryObject<FluidType> cocacola(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFB26B1F, new Vector3f(176f / 255f, 107f / 255f, 31f / 255f), properties));
    }

    private static RegistryObject<FluidType> berrycola(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFEB6B1F, new Vector3f(190f / 255f, 107f / 255f, 31f / 255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
