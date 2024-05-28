package com.humble.registry;

import com.humble.Humble;
import com.humble.item.PotteryPatternItem;
import com.humble.item.RockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class HumbleItems {
    public static final Item ROCK = registerItem("rock", new RockItem(new FabricItemSettings()));
    public static final Item BRICKS_POTTERY_PATTERN = registerItem("bricks_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item DASH_POTTERY_PATTERN = registerItem("dash_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item DIAMOND_POTTERY_PATTERN = registerItem("diamond_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item DOTS_POTTERY_PATTERN = registerItem("dots_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item LINES_POTTERY_PATTERN = registerItem("lines_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item WAVE_POTTERY_PATTERN = registerItem("wave_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item STRIPES_POTTERY_PATTERN = registerItem("stripes_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));
    public static final Item TILES_POTTERY_PATTERN = registerItem("tiles_pottery_pattern", new PotteryPatternItem(new FabricItemSettings()));

    private static void addToIngredientGroup(FabricItemGroupEntries entries) {
        entries.accept(HumbleItems.ROCK);
        entries.accept(HumbleItems.BRICKS_POTTERY_PATTERN);
        entries.accept(HumbleItems.DASH_POTTERY_PATTERN);
        entries.accept(HumbleItems.DIAMOND_POTTERY_PATTERN);
        entries.accept(HumbleItems.DOTS_POTTERY_PATTERN);
        entries.accept(HumbleItems.LINES_POTTERY_PATTERN);
        entries.accept(HumbleItems.WAVE_POTTERY_PATTERN);
        entries.accept(HumbleItems.STRIPES_POTTERY_PATTERN);
        entries.accept(HumbleItems.TILES_POTTERY_PATTERN);
    }
    private static void addToNaturalGroup(FabricItemGroupEntries entries) {
        entries.accept(HumbleBlocks.COBBLED_PATH);
    }
    private static void addToFuncGroup(FabricItemGroupEntries entries) {
        entries.accept(HumbleBlocks.POTTERY_TABLE);
    }
    private static void addToColorGroup(FabricItemGroupEntries entries) {

        entries.accept(HumbleBlocks.TERRACOTTA_POT);
        entries.accept(HumbleBlocks.WHITE_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.GRAY_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.BLACK_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.BROWN_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.RED_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.LIME_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.GREEN_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.CYAN_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.BLUE_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_POT);
        entries.accept(HumbleBlocks.PINK_TERRACOTTA_POT);

        //Terracotta Bricks
        entries.accept(HumbleBlocks.TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.WHITE_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        entries.accept(HumbleBlocks.PINK_TERRACOTTA_BRICKS);
            //slab
            entries.accept(HumbleBlocks.TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_BRICKS_SLAB);
            //stairs
            entries.accept(HumbleBlocks.TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_BRICKS_STAIRS);
        //Polished Terracotta 
        entries.accept(HumbleBlocks.POLISHED_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_WHITE_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_GRAY_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_BLACK_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_BROWN_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_RED_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_LIME_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_GREEN_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_CYAN_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_BLUE_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA);
        entries.accept(HumbleBlocks.POLISHED_PINK_TERRACOTTA);
            //slab
            entries.accept(HumbleBlocks.POLISHED_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_RED_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_LIME_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB);
            entries.accept(HumbleBlocks.POLISHED_PINK_TERRACOTTA_SLAB);
        //stairs
            entries.accept(HumbleBlocks.POLISHED_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_RED_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_LIME_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS);
            entries.accept(HumbleBlocks.POLISHED_PINK_TERRACOTTA_STAIRS);
        //Terracotta Tiles
        entries.accept(HumbleBlocks.TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.WHITE_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.GRAY_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.BLACK_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.BROWN_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.RED_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.LIME_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.GREEN_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.CYAN_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.BLUE_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_TILES);
        entries.accept(HumbleBlocks.PINK_TERRACOTTA_TILES);
            //slab
            entries.accept(HumbleBlocks.TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_SLAB);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_TILES_SLAB);
            //stairs
            entries.accept(HumbleBlocks.TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_STAIRS);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_TILES_STAIRS);
        //Terracotta Shingles
        entries.accept(HumbleBlocks.TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.RED_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.LIME_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        entries.accept(HumbleBlocks.PINK_TERRACOTTA_SHINGLES);
            //slab
            entries.accept(HumbleBlocks.TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_SLAB);
            //stairs
            entries.accept(HumbleBlocks.TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.RED_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS);
            entries.accept(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Humble.MOD_ID, name), item);
    }
    public static void registerHumbleItems() {
        Humble.LOGGER.info("Registering Items for " + Humble.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(HumbleItems::addToIngredientGroup);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(HumbleItems::addToNaturalGroup);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(HumbleItems::addToColorGroup);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(HumbleItems::addToFuncGroup);
    }
}
