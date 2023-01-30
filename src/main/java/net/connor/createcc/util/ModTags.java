package net.connor.createcc.util;

import net.connor.createcc.CreateCC;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> COLORED_COCAINE_BLOCK
                = tag("colored_cocaine_block");
        public static final TagKey<Block> COLORED_COCAINE_BLOCK_FORGE
                = forgeTag("colored_cocaine_block");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CreateCC.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {
        public static final TagKey<Item> SALT
                = forgeTag("salt");

        public static final TagKey<Item> COCA_SEEDS
                = forgeTag("seeds");

        public static final TagKey<Item> COCA_LEAVES
                = forgeTag("crops");

        public static final TagKey<Item> POWDERED_COCAINE
                = forgeTag("cocaine");

        public static final TagKey<Item> CHLORINE_CRYSTAL
                = forgeTag("chlorine_crystal");

        public static final TagKey<Item> HYDROGEN_CHLORIDE_CRYSTAL
                = forgeTag("hydrogen_chloride");

        public static final TagKey<Item> HYDROGEN_CRYSTAL
                = forgeTag("hydrogen_crystal");




        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CreateCC.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
