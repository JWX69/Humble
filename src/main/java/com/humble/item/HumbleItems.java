package com.humble.item;

import com.humble.Humble;
import com.humble.block.HumbleBlocks;
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
    private static void addToBuildingGroup(FabricItemGroupEntries entries) {
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
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Humble.MOD_ID, name), item);
    }
    public static void registerHumbleItems() {
        Humble.LOGGER.info("Registering Items for " + Humble.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(HumbleItems::addToIngredientGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(HumbleItems::addToNaturalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(HumbleItems::addToBuildingGroup);
    }
}
