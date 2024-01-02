package com.humble.datagen;

import com.humble.registry.HumbleBlocks;
import com.humble.registry.HumbleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class HumbleModelProvider extends FabricModelProvider {
    public HumbleModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Terracotta Bricks
        BlockStateModelGenerator.BlockTexturePool terracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PINK_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.WHITE_TERRACOTTA_BRICKS);

        //Polished Terracotta
        BlockStateModelGenerator.BlockTexturePool polishedTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedRedTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedOrangeTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedYellowTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedLimeTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedGreenTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedBlueTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedCyanTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedLightBlueTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedMagentaTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedPurpleTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedPinkTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_PINK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedBlackTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedBrownTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedGrayTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedLightGrayTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool polishedWhiteTerracotta = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.POLISHED_WHITE_TERRACOTTA);

        //Terracotta Tiles
        BlockStateModelGenerator.BlockTexturePool terracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool redTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.RED_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.ORANGE_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.YELLOW_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIME_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GREEN_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLUE_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.CYAN_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.MAGENTA_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PURPLE_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PINK_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLACK_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BROWN_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GRAY_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaTiles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.WHITE_TERRACOTTA_TILES);

        //Terracotta Shingles
        BlockStateModelGenerator.BlockTexturePool terracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool redTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.RED_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIME_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.PINK_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES);

        //Slabs
        terracottaBricks.slab(HumbleBlocks.TERRACOTTA_BRICKS_SLAB);
        redTerracottaBricks.slab(HumbleBlocks.RED_TERRACOTTA_BRICKS_SLAB);
        orangeTerracottaBricks.slab(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB);
        yellowTerracottaBricks.slab(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB);
        limeTerracottaBricks.slab(HumbleBlocks.LIME_TERRACOTTA_BRICKS_SLAB);
        greenTerracottaBricks.slab(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_SLAB);
        blueTerracottaBricks.slab(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_SLAB);
        cyanTerracottaBricks.slab(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_SLAB);
        lightBlueTerracottaBricks.slab(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB);
        magentaTerracottaBricks.slab(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB);
        purpleTerracottaBricks.slab(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB);
        pinkTerracottaBricks.slab(HumbleBlocks.PINK_TERRACOTTA_BRICKS_SLAB);
        blackTerracottaBricks.slab(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_SLAB);
        brownTerracottaBricks.slab(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_SLAB);
        grayTerracottaBricks.slab(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_SLAB);
        lightGrayTerracottaBricks.slab(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB);
        whiteTerracottaBricks.slab(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_SLAB);

        polishedTerracotta.slab(HumbleBlocks.POLISHED_TERRACOTTA_SLAB);
        polishedRedTerracotta.slab(HumbleBlocks.POLISHED_RED_TERRACOTTA_SLAB);
        polishedOrangeTerracotta.slab(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB);
        polishedYellowTerracotta.slab(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB);
        polishedLimeTerracotta.slab(HumbleBlocks.POLISHED_LIME_TERRACOTTA_SLAB);
        polishedGreenTerracotta.slab(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_SLAB);
        polishedBlueTerracotta.slab(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_SLAB);
        polishedCyanTerracotta.slab(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_SLAB);
        polishedLightBlueTerracotta.slab(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB);
        polishedMagentaTerracotta.slab(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB);
        polishedPurpleTerracotta.slab(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB);
        polishedPinkTerracotta.slab(HumbleBlocks.POLISHED_PINK_TERRACOTTA_SLAB);
        polishedBlackTerracotta.slab(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_SLAB);
        polishedBrownTerracotta.slab(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_SLAB);
        polishedGrayTerracotta.slab(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_SLAB);
        polishedLightGrayTerracotta.slab(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB);
        polishedWhiteTerracotta.slab(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_SLAB);

        terracottaTiles.slab(HumbleBlocks.TERRACOTTA_TILES_SLAB);
        redTerracottaTiles.slab(HumbleBlocks.RED_TERRACOTTA_TILES_SLAB);
        orangeTerracottaTiles.slab(HumbleBlocks.ORANGE_TERRACOTTA_TILES_SLAB);
        yellowTerracottaTiles.slab(HumbleBlocks.YELLOW_TERRACOTTA_TILES_SLAB);
        limeTerracottaTiles.slab(HumbleBlocks.LIME_TERRACOTTA_TILES_SLAB);
        greenTerracottaTiles.slab(HumbleBlocks.GREEN_TERRACOTTA_TILES_SLAB);
        blueTerracottaTiles.slab(HumbleBlocks.BLUE_TERRACOTTA_TILES_SLAB);
        cyanTerracottaTiles.slab(HumbleBlocks.CYAN_TERRACOTTA_TILES_SLAB);
        lightBlueTerracottaTiles.slab(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_SLAB);
        magentaTerracottaTiles.slab(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_SLAB);
        purpleTerracottaTiles.slab(HumbleBlocks.PURPLE_TERRACOTTA_TILES_SLAB);
        pinkTerracottaTiles.slab(HumbleBlocks.PINK_TERRACOTTA_TILES_SLAB);
        blackTerracottaTiles.slab(HumbleBlocks.BLACK_TERRACOTTA_TILES_SLAB);
        brownTerracottaTiles.slab(HumbleBlocks.BROWN_TERRACOTTA_TILES_SLAB);
        grayTerracottaTiles.slab(HumbleBlocks.GRAY_TERRACOTTA_TILES_SLAB);
        lightGrayTerracottaTiles.slab(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_SLAB);
        whiteTerracottaTiles.slab(HumbleBlocks.WHITE_TERRACOTTA_TILES_SLAB);

        terracottaShingles.slab(HumbleBlocks.TERRACOTTA_SHINGLES_SLAB);
        redTerracottaShingles.slab(HumbleBlocks.RED_TERRACOTTA_SHINGLES_SLAB);
        orangeTerracottaShingles.slab(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB);
        yellowTerracottaShingles.slab(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB);
        limeTerracottaShingles.slab(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_SLAB);
        greenTerracottaShingles.slab(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB);
        blueTerracottaShingles.slab(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB);
        cyanTerracottaShingles.slab(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB);
        lightBlueTerracottaShingles.slab(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB);
        magentaTerracottaShingles.slab(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB);
        purpleTerracottaShingles.slab(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB);
        pinkTerracottaShingles.slab(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_SLAB);
        blackTerracottaShingles.slab(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB);
        brownTerracottaShingles.slab(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB);
        grayTerracottaShingles.slab(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB);
        lightGrayTerracottaShingles.slab(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB);
        whiteTerracottaShingles.slab(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB);

        //Stairs
        // Terracotta Bricks
        terracottaBricks.stairs(HumbleBlocks.TERRACOTTA_BRICKS_STAIRS);
        redTerracottaBricks.stairs(HumbleBlocks.RED_TERRACOTTA_BRICKS_STAIRS);
        orangeTerracottaBricks.stairs(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS);
        yellowTerracottaBricks.stairs(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS);
        limeTerracottaBricks.stairs(HumbleBlocks.LIME_TERRACOTTA_BRICKS_STAIRS);
        greenTerracottaBricks.stairs(HumbleBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS);
        blueTerracottaBricks.stairs(HumbleBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS);
        cyanTerracottaBricks.stairs(HumbleBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS);
        lightBlueTerracottaBricks.stairs(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS);
        magentaTerracottaBricks.stairs(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS);
        purpleTerracottaBricks.stairs(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS);
        pinkTerracottaBricks.stairs(HumbleBlocks.PINK_TERRACOTTA_BRICKS_STAIRS);
        blackTerracottaBricks.stairs(HumbleBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS);
        brownTerracottaBricks.stairs(HumbleBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS);
        grayTerracottaBricks.stairs(HumbleBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS);
        lightGrayTerracottaBricks.stairs(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS);
        whiteTerracottaBricks.stairs(HumbleBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS);

        polishedTerracotta.stairs(HumbleBlocks.POLISHED_TERRACOTTA_STAIRS);
        polishedRedTerracotta.stairs(HumbleBlocks.POLISHED_RED_TERRACOTTA_STAIRS);
        polishedOrangeTerracotta.stairs(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS);
        polishedYellowTerracotta.stairs(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS);
        polishedLimeTerracotta.stairs(HumbleBlocks.POLISHED_LIME_TERRACOTTA_STAIRS);
        polishedGreenTerracotta.stairs(HumbleBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS);
        polishedBlueTerracotta.stairs(HumbleBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS);
        polishedCyanTerracotta.stairs(HumbleBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS);
        polishedLightBlueTerracotta.stairs(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS);
        polishedMagentaTerracotta.stairs(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS);
        polishedPurpleTerracotta.stairs(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS);
        polishedPinkTerracotta.stairs(HumbleBlocks.POLISHED_PINK_TERRACOTTA_STAIRS);
        polishedBlackTerracotta.stairs(HumbleBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS);
        polishedBrownTerracotta.stairs(HumbleBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS);
        polishedGrayTerracotta.stairs(HumbleBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS);
        polishedLightGrayTerracotta.stairs(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS);
        polishedWhiteTerracotta.stairs(HumbleBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS);

        terracottaTiles.stairs(HumbleBlocks.TERRACOTTA_TILES_STAIRS);
        redTerracottaTiles.stairs(HumbleBlocks.RED_TERRACOTTA_TILES_STAIRS);
        orangeTerracottaTiles.stairs(HumbleBlocks.ORANGE_TERRACOTTA_TILES_STAIRS);
        yellowTerracottaTiles.stairs(HumbleBlocks.YELLOW_TERRACOTTA_TILES_STAIRS);
        limeTerracottaTiles.stairs(HumbleBlocks.LIME_TERRACOTTA_TILES_STAIRS);
        greenTerracottaTiles.stairs(HumbleBlocks.GREEN_TERRACOTTA_TILES_STAIRS);
        blueTerracottaTiles.stairs(HumbleBlocks.BLUE_TERRACOTTA_TILES_STAIRS);
        cyanTerracottaTiles.stairs(HumbleBlocks.CYAN_TERRACOTTA_TILES_STAIRS);
        lightBlueTerracottaTiles.stairs(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_STAIRS);
        magentaTerracottaTiles.stairs(HumbleBlocks.MAGENTA_TERRACOTTA_TILES_STAIRS);
        purpleTerracottaTiles.stairs(HumbleBlocks.PURPLE_TERRACOTTA_TILES_STAIRS);
        pinkTerracottaTiles.stairs(HumbleBlocks.PINK_TERRACOTTA_TILES_STAIRS);
        blackTerracottaTiles.stairs(HumbleBlocks.BLACK_TERRACOTTA_TILES_STAIRS);
        brownTerracottaTiles.stairs(HumbleBlocks.BROWN_TERRACOTTA_TILES_STAIRS);
        grayTerracottaTiles.stairs(HumbleBlocks.GRAY_TERRACOTTA_TILES_STAIRS);
        lightGrayTerracottaTiles.stairs(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_STAIRS);
        whiteTerracottaTiles.stairs(HumbleBlocks.WHITE_TERRACOTTA_TILES_STAIRS);

        terracottaShingles.stairs(HumbleBlocks.TERRACOTTA_SHINGLES_STAIRS);
        redTerracottaShingles.stairs(HumbleBlocks.RED_TERRACOTTA_SHINGLES_STAIRS);
        orangeTerracottaShingles.stairs(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS);
        yellowTerracottaShingles.stairs(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS);
        limeTerracottaShingles.stairs(HumbleBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS);
        greenTerracottaShingles.stairs(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS);
        blueTerracottaShingles.stairs(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS);
        cyanTerracottaShingles.stairs(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS);
        lightBlueTerracottaShingles.stairs(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS);
        magentaTerracottaShingles.stairs(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS);
        purpleTerracottaShingles.stairs(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS);
        pinkTerracottaShingles.stairs(HumbleBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS);
        blackTerracottaShingles.stairs(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS);
        brownTerracottaShingles.stairs(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS);
        grayTerracottaShingles.stairs(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS);
        lightGrayTerracottaShingles.stairs(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS);
        whiteTerracottaShingles.stairs(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(HumbleItems.ROCK, Models.GENERATED);
    }
}
