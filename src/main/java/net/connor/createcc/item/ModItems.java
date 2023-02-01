package net.connor.createcc.item;

import net.connor.createcc.CreateCC;
import net.connor.createcc.block.ModBlocks;
import net.connor.createcc.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateCC.MOD_ID);

    //SEEDS-CROPS
    public static final RegistryObject<Item> COCA_SEEDS = ITEMS.register("coca_seeds",
            () -> new ItemNameBlockItem(ModBlocks.COCA_CROP.get(),
                    new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> COCA_LEAVES = ITEMS.register("coca_leaves",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCA_LEAVES)));

    // COCAINE PROCESS
    public static final RegistryObject<Item> COCA_LEAVES_PASTE = ITEMS.register("coca_leaves_paste",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCA_LEAVES_PASTE)));

    public static final RegistryObject<Item> HYDROGEN_CHLORIDE_CRYSTAL = ITEMS.register("hydrogen_chloride_crystal",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item>
            CHLORINE_CRYSTAL = ITEMS.register("chlorine_crystal",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> HYDROGEN_CRYSTAL = ITEMS.register("hydrogen_crystal",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> ELECTRO_CATALYST = ITEMS.register("electro_catalyst",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> COCA_PASTE_CHEMICAL_INFUSED = ITEMS.register("coca_paste_chemical_infused",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCA_PASTE_CHEMICAL_INFUSED)));

    public static final RegistryObject<Item> COCA_PASTE_EXTRACT = ITEMS.register("coca_paste_extract",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCA_PASTE_EXTRACT)));

    public static final RegistryObject<Item> COCAINE_BRICK = ITEMS.register("cocaine_brick",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCAINE_BRICK)));

    public static final RegistryObject<Item> COCAINE_POWDER = ITEMS.register("cocaine_powder",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCAINE_POWDER)));

    public static final RegistryObject<Item> COCAINE_SNORTER = ITEMS.register("cocaine_snorter",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .food(ModFoods.COCAINE_SNORTER)));

    //FLUID BUCKETS
    public static final RegistryObject<Item> HYDROCHLORIC_ACID_BUCKET = ITEMS.register("hydrochloric_acid_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HYDROCHLORIC_ACID.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> SUGAR_WATER_BUCKET = ITEMS.register("sugar_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SUGAR_WATER.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRY_WATER_BUCKET = ITEMS.register("sweet_berry_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEET_BERRY_WATER.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRY_CONCENTRATE_BUCKET = ITEMS.register("sweet_berry_concentrate_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEET_BERRY_CONCENTRATE.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> COLA_SYRUP_BUCKET = ITEMS.register("cola_syrup_bucket",
            () -> new BucketItem(ModFluids.SOURCE_COLA_SYRUP.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> COCA_COLA_BUCKET = ITEMS.register("coca_cola_bucket",
            () -> new BucketItem(ModFluids.SOURCE_COCA_COLA.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRY_COLA_BUCKET = ITEMS.register("sweet_berry_cola_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SWEET_BERRY_COLA.get(),
                    new Item.Properties().tab(CreateCC.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
    // COLA

    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> INCOMPLETE_LABELED_CAN = ITEMS.register("incomplete_labeled_can",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> LABEL = ITEMS.register("label",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> INCOMPLETE_LABEL = ITEMS.register("incomplete_label",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> LABELED_CAN = ITEMS.register("labeled_can",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> GROUND_ROTTEN_FLESH = ITEMS.register("ground_rotten_flesh",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> COLA_SPICES = ITEMS.register("cola_spices",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)));

    public static final RegistryObject<Item> COCA_COLA = ITEMS.register("coca_cola",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .stacksTo(24)
                    .food(ModFoods.COCA_COLA)));

    public static final RegistryObject<Item> SWEET_BERRY_COLA = ITEMS.register("sweet_berry_cola",
            () -> new Item(new Item.Properties().tab(CreateCC.TAB)
                    .stacksTo(24)
                    .food(ModFoods.SWEET_BERRY_COLA)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
