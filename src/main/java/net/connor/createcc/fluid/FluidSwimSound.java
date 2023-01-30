package net.connor.createcc.fluid;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import org.jetbrains.annotations.ApiStatus;

/**
 * A class that holds the swimming sounds for a fluid. Use {@link Builder#create()} to create a new builder.
 *
 * <p>
 * The sounds are:
 *  <ul>
 *      <li>Swim sound - Sound for when an entity is actively moving in a fluid</li>
 *      <li>Splash sound - Sound for when an entity is jumping into a fluid</li>
 *      <li>High speed splash sound - Sound for when an entity is jumping into a fluid at a high speed</li>
 * </ul>
 * </p>
 */
public class FluidSwimSound {
    private final SoundEvent swimSound;
    private final SoundEvent splashSound;
    private final SoundEvent highSpeedSplashSound;

    /**
     * Creates a fluid swim sound with the sounds from the builder. Use {@link Builder#create()} to create a new builder.
     *
     * @param builder The builder to create the fluid swim sound
     */
    public FluidSwimSound(Builder builder) {
        this.swimSound = builder.swimSound;
        this.splashSound = builder.splashSound;
        this.highSpeedSplashSound = builder.highSpeedSplashSound;
    }

    public SoundEvent getSwimSound() {
        return this.swimSound;
    }

    public SoundEvent getSplashSound() {
        return this.splashSound;
    }

    public SoundEvent getHighSpeedSplashSound() {
        return this.highSpeedSplashSound;
    }

    public static class Builder {
        private SoundEvent swimSound = SoundEvents.PLAYER_SWIM;
        private SoundEvent splashSound = SoundEvents.PLAYER_SPLASH;
        private SoundEvent highSpeedSplashSound = SoundEvents.PLAYER_SPLASH_HIGH_SPEED;

        @ApiStatus.Internal
        private Builder() {
        }

        /**
         * Creates a new builder
         *
         * @return The builder
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Sound for when an entity is actively moving in a fluid
         *
         * @param swimSound The sound to play
         * @return The builder
         */
        public Builder swimSound(SoundEvent swimSound) {
            this.swimSound = swimSound;
            return this;
        }

        /**
         * Sound for when an entity is jumping into a fluid
         *
         * @param splashSound The sound to play
         * @return The builder
         */
        public Builder splashSound(SoundEvent splashSound) {
            this.splashSound = splashSound;
            return this;
        }

        /**
         * Sound for when an entity is jumping into a fluid at a high speed
         *
         * @param highSpeedSplashSound The sound to play
         * @return The builder
         */
        public Builder highSpeedSplashSound(SoundEvent highSpeedSplashSound) {
            this.highSpeedSplashSound = highSpeedSplashSound;
            return this;
        }
    }
}
