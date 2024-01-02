package com.humble.block;

import com.humble.Humble;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HumbleBlocks {

    // Registry

    public static final Block COBBLED_PATH = registerBlock("cobbled_path",
            new DirtPathBlock(FabricBlockSettings.copyOf(Blocks.DIRT_PATH)));

    // Terracotta Bricks

    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    // End Registry

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Humble.MOD_ID, name), block);
    }
    private static Block registerBlockNoItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Humble.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Humble.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerHumbleBlocks() {
        Humble.LOGGER.info("Registering Blocks for " +Humble.MOD_ID);
    }
}
