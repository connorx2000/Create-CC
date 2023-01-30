package net.connor.createcc.fluid;

import com.mojang.math.Vector3f;
import net.connor.createcc.CreateCC;
import net.minecraft.resources.ResourceLocation;
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


    public static final RegistryObject<FluidType> HYDROCHLORIC_ACID_FLUID_TYPE = register("hydrochloric_acid_fluid_type",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .temperature(100));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, HYDROCHLORIC_ACID_OVERLAY_RL,
                0xFFE9F0F1, new Vector3f(233f / 255f, 240f / 255f, 241f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
