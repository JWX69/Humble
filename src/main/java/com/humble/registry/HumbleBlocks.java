package com.humble.registry;

import com.humble.Humble;
import com.humble.block.PotBlock;
import com.humble.block.PotteryTableBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;

public class HumbleBlocks {

    // Registry

    public static final Block COBBLED_PATH = registerBlock("cobbled_path",
            new DirtPathBlock(FabricBlockSettings.copyOf(Blocks.DIRT_PATH)));
    public static final Block POTTERY_TABLE = registerBlock("pottery_table",
            new PotteryTableBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).noOcclusion()));
    public static final Block TERRACOTTA_POT = registerBlock("terracotta_pot",
            new PotBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).noOcclusion()));

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

    //Terracotta Brick Stairs
    public static final Block TERRACOTTA_BRICKS_STAIRS = registerBlock("terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS_STAIRS = registerBlock("red_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.RED_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS_STAIRS = registerBlock("orange_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS_STAIRS = registerBlock("yellow_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS_STAIRS = registerBlock("lime_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.LIME_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS_STAIRS = registerBlock("green_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.GREEN_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS_STAIRS = registerBlock("blue_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.BLUE_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS_STAIRS = registerBlock("cyan_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.CYAN_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS = registerBlock("light_blue_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS_STAIRS = registerBlock("magenta_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS_STAIRS = registerBlock("purple_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS_STAIRS = registerBlock("pink_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.PINK_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS_STAIRS = registerBlock("black_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.BLACK_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS_STAIRS = registerBlock("gray_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.GRAY_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS_STAIRS = registerBlock("brown_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.BROWN_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS = registerBlock("light_gray_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BRICKS_STAIRS = registerBlock("white_terracotta_bricks_stairs",
            new StairBlock(HumbleBlocks.WHITE_TERRACOTTA_BRICKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Brick Slab
    public static final Block TERRACOTTA_BRICKS_SLAB = registerBlock("terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS_SLAB = registerBlock("red_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS_SLAB = registerBlock("orange_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS_SLAB = registerBlock("yellow_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS_SLAB = registerBlock("lime_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS_SLAB = registerBlock("green_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS_SLAB = registerBlock("blue_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS_SLAB = registerBlock("cyan_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB = registerBlock("light_blue_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS_SLAB = registerBlock("magenta_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS_SLAB = registerBlock("purple_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS_SLAB = registerBlock("pink_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS_SLAB = registerBlock("black_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS_SLAB = registerBlock("gray_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS_SLAB = registerBlock("brown_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB = registerBlock("light_gray_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BRICKS_SLAB = registerBlock("white_terracotta_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));


    //Polished Terracotta
    public static final Block POLISHED_TERRACOTTA = registerBlock("polished_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block POLISHED_RED_TERRACOTTA = registerBlock("polished_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA = registerBlock("polished_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA = registerBlock("polished_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA = registerBlock("polished_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA = registerBlock("polished_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA = registerBlock("polished_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA = registerBlock("polished_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA = registerBlock("polished_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA = registerBlock("polished_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA = registerBlock("polished_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA = registerBlock("polished_pink_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA = registerBlock("polished_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA = registerBlock("polished_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA = registerBlock("polished_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA = registerBlock("polished_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA = registerBlock("polished_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    //Polished Terracotta Stairs
    public static final Block POLISHED_TERRACOTTA_STAIRS = registerBlock("polished_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block POLISHED_RED_TERRACOTTA_STAIRS = registerBlock("polished_red_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_RED_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_STAIRS = registerBlock("polished_orange_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_STAIRS = registerBlock("polished_yellow_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_STAIRS = registerBlock("polished_lime_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_LIME_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_STAIRS = registerBlock("polished_green_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_GREEN_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_STAIRS = registerBlock("polished_blue_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_BLUE_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_STAIRS = registerBlock("polished_cyan_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_CYAN_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("polished_light_blue_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_STAIRS = registerBlock("polished_magenta_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_STAIRS = registerBlock("polished_purple_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_STAIRS = registerBlock("polished_pink_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_PINK_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_STAIRS = registerBlock("polished_black_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_BLACK_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_STAIRS = registerBlock("polished_gray_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_GRAY_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_STAIRS = registerBlock("polished_brown_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_BROWN_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("polished_light_gray_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_STAIRS = registerBlock("polished_white_terracotta_stairs",
            new StairBlock(HumbleBlocks.POLISHED_WHITE_TERRACOTTA.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Polished Terracotta Slab
    public static final Block POLISHED_TERRACOTTA_SLAB = registerBlock("polished_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block POLISHED_RED_TERRACOTTA_SLAB = registerBlock("polished_red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_SLAB = registerBlock("polished_orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_SLAB = registerBlock("polished_yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_SLAB = registerBlock("polished_lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_SLAB = registerBlock("polished_green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_SLAB = registerBlock("polished_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_SLAB = registerBlock("polished_cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("polished_light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_SLAB = registerBlock("polished_magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_SLAB = registerBlock("polished_purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_SLAB = registerBlock("polished_pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_SLAB = registerBlock("polished_black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_SLAB = registerBlock("polished_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_SLAB = registerBlock("polished_brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("polished_light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_SLAB = registerBlock("polished_white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));


    //Terracotta Tiles
    public static final Block TERRACOTTA_TILES = registerBlock("terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_TILES = registerBlock("red_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TILES = registerBlock("orange_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TILES = registerBlock("yellow_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TILES = registerBlock("lime_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TILES = registerBlock("green_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TILES = registerBlock("blue_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TILES = registerBlock("cyan_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILES = registerBlock("light_blue_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TILES = registerBlock("magenta_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TILES = registerBlock("purple_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TILES = registerBlock("pink_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TILES = registerBlock("black_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TILES = registerBlock("gray_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TILES = registerBlock("brown_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILES = registerBlock("light_gray_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TILES = registerBlock("white_terracotta_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Tile Slabs
    public static final Block TERRACOTTA_TILES_SLAB = registerBlock("terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_TILES_SLAB = registerBlock("red_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TILES_SLAB = registerBlock("orange_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TILES_SLAB = registerBlock("yellow_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TILES_SLAB = registerBlock("lime_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TILES_SLAB = registerBlock("green_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TILES_SLAB = registerBlock("blue_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TILES_SLAB = registerBlock("cyan_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILES_SLAB = registerBlock("light_blue_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TILES_SLAB = registerBlock("magenta_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TILES_SLAB = registerBlock("purple_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TILES_SLAB = registerBlock("pink_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TILES_SLAB = registerBlock("black_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TILES_SLAB = registerBlock("gray_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TILES_SLAB = registerBlock("brown_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILES_SLAB = registerBlock("light_gray_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TILES_SLAB = registerBlock("white_terracotta_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Tile Stairs
    public static final Block TERRACOTTA_TILES_STAIRS = registerBlock("terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_TILES_STAIRS = registerBlock("red_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.RED_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TILES_STAIRS = registerBlock("orange_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.ORANGE_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TILES_STAIRS = registerBlock("yellow_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.YELLOW_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TILES_STAIRS = registerBlock("lime_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.LIME_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TILES_STAIRS = registerBlock("green_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.GREEN_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TILES_STAIRS = registerBlock("blue_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.BLUE_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TILES_STAIRS = registerBlock("cyan_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.CYAN_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILES_STAIRS = registerBlock("light_blue_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TILES_STAIRS = registerBlock("magenta_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.MAGENTA_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TILES_STAIRS = registerBlock("purple_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.PURPLE_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TILES_STAIRS = registerBlock("pink_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.PINK_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TILES_STAIRS = registerBlock("black_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.BLACK_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TILES_STAIRS = registerBlock("gray_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.GRAY_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TILES_STAIRS = registerBlock("brown_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.BROWN_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILES_STAIRS = registerBlock("light_gray_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TILES_STAIRS = registerBlock("white_terracotta_tiles_stairs",
            new StairBlock(HumbleBlocks.WHITE_TERRACOTTA_TILES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Shingles
    public static final Block TERRACOTTA_SHINGLES = registerBlock("terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SHINGLES = registerBlock("red_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SHINGLES = registerBlock("orange_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SHINGLES = registerBlock("yellow_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SHINGLES = registerBlock("lime_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SHINGLES = registerBlock("green_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SHINGLES = registerBlock("blue_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SHINGLES = registerBlock("cyan_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES = registerBlock("light_blue_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SHINGLES = registerBlock("magenta_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SHINGLES = registerBlock("purple_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SHINGLES = registerBlock("pink_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SHINGLES = registerBlock("black_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SHINGLES = registerBlock("gray_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SHINGLES = registerBlock("brown_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES = registerBlock("light_gray_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SHINGLES = registerBlock("white_terracotta_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Shingle Slabs
    public static final Block TERRACOTTA_SHINGLES_SLAB = registerBlock("terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SHINGLES_SLAB = registerBlock("red_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SHINGLES_SLAB = registerBlock("orange_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SHINGLES_SLAB = registerBlock("yellow_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SHINGLES_SLAB = registerBlock("lime_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SHINGLES_SLAB = registerBlock("green_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SHINGLES_SLAB = registerBlock("blue_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SHINGLES_SLAB = registerBlock("cyan_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB = registerBlock("light_blue_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SHINGLES_SLAB = registerBlock("magenta_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SHINGLES_SLAB = registerBlock("purple_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SHINGLES_SLAB = registerBlock("pink_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SHINGLES_SLAB = registerBlock("black_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SHINGLES_SLAB = registerBlock("gray_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SHINGLES_SLAB = registerBlock("brown_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB = registerBlock("light_gray_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SHINGLES_SLAB = registerBlock("white_terracotta_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    //Terracotta Shingle Stairs
    public static final Block TERRACOTTA_SHINGLES_STAIRS = registerBlock("terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SHINGLES_STAIRS = registerBlock("red_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.RED_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SHINGLES_STAIRS = registerBlock("orange_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SHINGLES_STAIRS = registerBlock("yellow_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SHINGLES_STAIRS = registerBlock("lime_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.LIME_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SHINGLES_STAIRS = registerBlock("green_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SHINGLES_STAIRS = registerBlock("blue_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SHINGLES_STAIRS = registerBlock("cyan_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS = registerBlock("light_blue_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SHINGLES_STAIRS = registerBlock("magenta_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SHINGLES_STAIRS = registerBlock("purple_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SHINGLES_STAIRS = registerBlock("pink_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.PINK_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SHINGLES_STAIRS = registerBlock("black_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SHINGLES_STAIRS = registerBlock("gray_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SHINGLES_STAIRS = registerBlock("brown_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS = registerBlock("light_gray_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SHINGLES_STAIRS = registerBlock("white_terracotta_shingles_stairs",
            new StairBlock(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));


    // End Registry

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Humble.MOD_ID, name), block);
    }

    private static Block registerBlockNoItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Humble.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Humble.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerHumbleBlocks() {
        Humble.LOGGER.info("Registering Blocks for " + Humble.MOD_ID);
    }
}
