package net.connor.createcc.event;

import net.connor.createcc.CreateCC;
import net.connor.createcc.fluid.FluidSwimSound;
import net.connor.createcc.fluid.FluidSwimmingSounds;
import net.connor.createcc.fluid.ModFluidTypes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CreateCC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FluidSwimmingSounds.register(ModFluidTypes.HYDROCHLORIC_ACID_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.SUGAR_WATER_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.SWEET_BERRY_COLA_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.SWEET_BERRY_CONCENTRATE_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.COLA_SYRUP_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.COCA_COLA_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));
            FluidSwimmingSounds.register(ModFluidTypes.SWEET_BERRY_WATER_FLUID_TYPE,
                    new FluidSwimSound(FluidSwimSound.Builder.create()));

        });
    }
}
