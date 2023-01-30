package net.connor.createcc.fluid;

import net.minecraft.world.entity.MoverType;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Holds a map of fluids to their fluid swim sounds.
 * <p>
 * This is required because fluid swimming sounds are hardcoded in
 * {@link net.minecraft.world.entity.Entity#move(MoverType, Vec3)}.
 * </p>
 *
 * @implNote This class is used in {@link net.connor.createcc.mixin.EntityMixin}.
 */
public class FluidSwimmingSounds {
    private static final Map<Supplier<? extends FluidType>, FluidSwimSound> SWIM_SOUND_MAP = new HashMap<>();

    /**
     * Should be called in {@link net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent} in
     * {@link net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent#enqueueWork(Runnable)}
     *
     * @param fluid The fluid type to give a fluid swim sound
     * @param sound The sounds to play when the player is swimming in the fluid type
     */
    public static void register(Supplier<? extends FluidType> fluid, FluidSwimSound sound) {
        SWIM_SOUND_MAP.put(fluid, sound);
    }

    /**
     * Gets the fluid swim sound for the fluid type
     *
     * @param fluid The fluid type to get the fluid swim sound for
     * @return The fluid swim sound for the fluid type
     */
    public static FluidSwimSound get(Supplier<? extends FluidType> fluid) {
        return SWIM_SOUND_MAP.get(fluid);
    }

    /**
     * Iterates over the fluid swim sound map
     *
     * @param consumer The consumer to apply to each entry in the fluid swim sound map
     */
    public static void iterate(Consumer<Map.Entry<Supplier<? extends FluidType>, FluidSwimSound>> consumer) {
        SWIM_SOUND_MAP.entrySet().forEach(consumer);
    }
}
