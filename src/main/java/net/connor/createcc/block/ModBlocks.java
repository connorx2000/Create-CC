package net.connor.createcc.block;

import net.connor.createcc.CreateCC;
import net.connor.createcc.block.custom.CocaCropBlock;
import net.connor.createcc.block.custom.SpeedyBlock;
import net.connor.createcc.fluid.ModFluids;
import net.connor.createcc.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCC.MOD_ID);

    public static final RegistryObject<Block> COCA_CROP = BLOCKS.register("coca_crop",
            () -> new CocaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> POWDERED_COCAINE_BLOCK = registerBlock("powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> ORANGE_POWDERED_COCAINE_BLOCK = registerBlock("orange_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> MAGENTA_POWDERED_COCAINE_BLOCK = registerBlock("magenta_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> LIGHT_BLUE_POWDERED_COCAINE_BLOCK = registerBlock("light_blue_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> YELLOW_POWDERED_COCAINE_BLOCK = registerBlock("yellow_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> LIME_POWDERED_COCAINE_BLOCK = registerBlock("lime_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> PINK_POWDERED_COCAINE_BLOCK = registerBlock("pink_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> GRAY_POWDERED_COCAINE_BLOCK = registerBlock("gray_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> LIGHT_GRAY_POWDERED_COCAINE_BLOCK = registerBlock("light_gray_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> CYAN_POWDERED_COCAINE_BLOCK = registerBlock("cyan_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> PURPLE_POWDERED_COCAINE_BLOCK = registerBlock("purple_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> BLUE_POWDERED_COCAINE_BLOCK = registerBlock("blue_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> BROWN_POWDERED_COCAINE_BLOCK = registerBlock("brown_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> GREEN_POWDERED_COCAINE_BLOCK = registerBlock("green_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> RED_POWDERED_COCAINE_BLOCK = registerBlock("red_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);

    public static final RegistryObject<Block> BLACK_POWDERED_COCAINE_BLOCK = registerBlock("black_powdered_cocaine_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(1)), CreateCC.TAB);


    //FLUID BLOCKS
    public static final RegistryObject<LiquidBlock> HYDROCHLORIC_ACID_BLOCK = BLOCKS.register("hydrochloric_acid_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HYDROCHLORIC_ACID, BlockBehaviour.Properties
                    .copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> SUGAR_WATER_BLOCK = BLOCKS.register("sugar_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SUGAR_WATER, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> SWEET_BERRY_WATER_BLOCK = BLOCKS.register("sweet_berry_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEET_BERRY_WATER, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> SWEET_BERRY_CONCENTRATE_BLOCK = BLOCKS.register("sweet_berry_concentrate_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEET_BERRY_CONCENTRATE, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> COLA_SYRUP_BLOCK = BLOCKS.register("cola_syrup_block",
            () -> new LiquidBlock(ModFluids.SOURCE_COLA_SYRUP, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> COCA_COLA_BLOCK = BLOCKS.register("coca_cola_block",
            () -> new LiquidBlock(ModFluids.SOURCE_COCA_COLA, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> SWEET_BERRY_COLA_BLOCK = BLOCKS.register("sweet_berry_cola_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SWEET_BERRY_COLA, BlockBehaviour.Properties
                    .copy(Blocks.WATER)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
