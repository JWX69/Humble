package com.humble.registry;

import com.humble.Humble;
import com.humble.item.RockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HumbleItems {
    public static final Item ROCK = registerItem("rock", new RockItem(new FabricItemSettings()));

    private static void addToIngredientGroup(FabricItemGroupEntries entries) {
        entries.add(HumbleItems.ROCK);
    }
    private static void addToNaturalGroup(FabricItemGroupEntries entries) {
        entries.add(HumbleBlocks.COBBLED_PATH);
    }
    private static void addToColorGroup(FabricItemGroupEntries entries) {
        //Terracotta Bricks
        entries.add(HumbleBlocks.TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.PINK_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        entries.add(HumbleBlocks.WHITE_TERRACOTTA_BRICKS);
            //slab
            entries.add(HumbleBlocks.TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.RED_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_SLAB);
            //stairs
            entries.add(HumbleBlocks.TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.RED_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS);
        //Polished Terracotta 
        entries.add(HumbleBlocks.POLISHED_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_RED_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_LIME_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_GREEN_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_BLUE_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_CYAN_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_PINK_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_BLACK_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_GRAY_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_BROWN_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA);
        entries.add(HumbleBlocks.POLISHED_WHITE_TERRACOTTA);
            //slab
            entries.add(HumbleBlocks.POLISHED_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_RED_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_LIME_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_PINK_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB);
            entries.add(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_SLAB);
        //stairs
            entries.add(HumbleBlocks.POLISHED_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_RED_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_LIME_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_PINK_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS);
            entries.add(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS);
        //Terracotta Tiles
        entries.add(HumbleBlocks.TERRACOTTA_TILES);
        entries.add(HumbleBlocks.RED_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.ORANGE_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.YELLOW_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.LIME_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.GREEN_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.BLUE_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.CYAN_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.PURPLE_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.PINK_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.BLACK_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.GRAY_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.BROWN_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
        entries.add(HumbleBlocks.WHITE_TERRACOTTA_TILES);
            //slab
            entries.add(HumbleBlocks.TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.RED_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_SLAB);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_TILES_SLAB);
            //stairs
            entries.add(HumbleBlocks.TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.RED_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_STAIRS);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_TILES_STAIRS);
        //Terracotta Shingles
        entries.add(HumbleBlocks.TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.RED_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.LIME_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.PINK_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        entries.add(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES);
            //slab
            entries.add(HumbleBlocks.TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.RED_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB);
            //stairs
            entries.add(HumbleBlocks.TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.RED_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS);
            entries.add(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Humble.MOD_ID, name), item);
    }
    public static void registerHumbleItems() {
        Humble.LOGGER.info("Registering Items for " + Humble.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(HumbleItems::addToIngredientGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(HumbleItems::addToNaturalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(HumbleItems::addToColorGroup);
    }
}
