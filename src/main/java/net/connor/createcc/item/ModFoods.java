package net.connor.createcc.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    //COCAINE
    public static final FoodProperties COCA_LEAVES = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 1), 1)
            .build();
    public static final FoodProperties COCA_LEAVES_PASTE = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 1)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200, 1), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 2), 1)
            .build();

    public static final FoodProperties COCA_PASTE_CHEMICAL_INFUSED = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.POISON, 300, 2), 1)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 400, 3), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 500, 2), 1)
            .build();

    public static final FoodProperties COCA_PASTE_EXTRACT = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2), 1)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 1), 1)
            .build();

    public static final FoodProperties COCAINE_BRICK = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.HARM, 6000, 2), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 6000, 2), 1)
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 300, 1), 1)
            .build();

    public static final FoodProperties COCAINE_POWDER = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 2), 1)
            .build();

    public static final FoodProperties COCAINE_SNORTER = (new FoodProperties.Builder())
            .alwaysEat()
            .fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 2), 1)
            .build();

    // COCA COLA

    public static final FoodProperties COCA_COLA = (new FoodProperties.Builder())
            .alwaysEat()
            .fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 24000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 24000, 2), 1)
            .build();

    public static final FoodProperties SWEET_BERRY_COLA = (new FoodProperties.Builder())
            .alwaysEat()
            .fast()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 24000, 3), 1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 24000, 2), 1)
            .build();
}
