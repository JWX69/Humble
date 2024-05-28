package com.humble.datagen;

import com.humble.registry.HumbleBlocks;
import com.humble.registry.HumbleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HumbleModelProvider extends FabricModelProvider {
    public HumbleModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        /*
        List<BlockModelGenerators.BlockFamilyProvider> blockFamilyProviders = new ArrayList<>();
        for (Map.Entry<String, Block> entry : HumbleBlocks.TERRACOTTA_BRICKS.entrySet()) {
            blockFamilyProviders.add(blockStateModelGenerator.family(entry.getValue()));
        }
        */
        //Terracotta Bricks
        BlockModelGenerators.BlockFamilyProvider terracottaBricks = blockStateModelGenerator.family(HumbleBlocks.TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider redTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider orangeTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider yellowTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider limeTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider greenTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider blueTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider cyanTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightBlueTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider magentaTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider purpleTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider pinkTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.PINK_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider blackTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider grayTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider brownTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightGrayTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        BlockModelGenerators.BlockFamilyProvider whiteTerracottaBricks = blockStateModelGenerator.family(HumbleBlocks.WHITE_TERRACOTTA_BRICKS);

        //Polished Terracotta
        BlockModelGenerators.BlockFamilyProvider polishedTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedRedTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_RED_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedOrangeTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_ORANGE_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedYellowTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_YELLOW_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedLimeTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_LIME_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedGreenTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_GREEN_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedBlueTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_BLUE_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedCyanTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_CYAN_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedLightBlueTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedMagentaTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedPurpleTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_PURPLE_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedPinkTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_PINK_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedBlackTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_BLACK_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedBrownTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_BROWN_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedGrayTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_GRAY_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedLightGrayTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA);
        BlockModelGenerators.BlockFamilyProvider polishedWhiteTerracotta = blockStateModelGenerator.family(HumbleBlocks.POLISHED_WHITE_TERRACOTTA);

        //Terracotta Tiles
        BlockModelGenerators.BlockFamilyProvider terracottaTiles = blockStateModelGenerator.family(HumbleBlocks.TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider redTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.RED_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider orangeTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.ORANGE_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider yellowTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.YELLOW_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider limeTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.LIME_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider greenTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.GREEN_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider blueTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.BLUE_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider cyanTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.CYAN_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider lightBlueTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider magentaTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.MAGENTA_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider purpleTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.PURPLE_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider pinkTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.PINK_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider blackTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.BLACK_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider brownTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.BROWN_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider grayTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.GRAY_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider lightGrayTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
        BlockModelGenerators.BlockFamilyProvider whiteTerracottaTiles = blockStateModelGenerator.family(HumbleBlocks.WHITE_TERRACOTTA_TILES);

        //Terracotta Shingles
        BlockModelGenerators.BlockFamilyProvider terracottaShingles = blockStateModelGenerator.family(HumbleBlocks.TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider redTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.RED_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider orangeTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider yellowTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider limeTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.LIME_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider greenTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.GREEN_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider blueTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.BLUE_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider cyanTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.CYAN_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider lightBlueTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider magentaTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider purpleTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider pinkTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.PINK_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider blackTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.BLACK_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider brownTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.BROWN_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider grayTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.GRAY_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider lightGrayTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        BlockModelGenerators.BlockFamilyProvider whiteTerracottaShingles = blockStateModelGenerator.family(HumbleBlocks.WHITE_TERRACOTTA_SHINGLES);

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
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(HumbleItems.ROCK, ModelTemplates.FLAT_ITEM);
    }
}
