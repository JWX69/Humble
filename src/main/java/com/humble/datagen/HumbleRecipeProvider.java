package com.humble.datagen;

import com.humble.registry.HumbleBlocks;
import com.humble.registry.HumbleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class HumbleRecipeProvider extends FabricRecipeProvider {
    public HumbleRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        nineBlockStorageRecipes(exporter, RecipeCategory.MISC, HumbleItems.ROCK, RecipeCategory.MISC,
                Blocks.COBBLESTONE);

    //Terracotta Bricks ect.
// Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_BRICKS, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_BRICKS, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_BRICKS, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_BRICKS, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_BRICKS, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_BRICKS, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_BRICKS, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_BRICKS, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_BRICKS, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_BRICKS, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_BRICKS, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_BRICKS, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_BRICKS, Blocks.WHITE_TERRACOTTA);
// Brick Slabs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_BRICKS_SLAB, Blocks.TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_BRICKS_SLAB, Blocks.RED_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_BRICKS_SLAB, Blocks.LIME_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_BRICKS_SLAB, Blocks.GREEN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_BRICKS_SLAB, Blocks.BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_BRICKS_SLAB, Blocks.CYAN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_BRICKS_SLAB, Blocks.PINK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_BRICKS_SLAB, Blocks.BLACK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_BRICKS_SLAB, Blocks.GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_BRICKS_SLAB, Blocks.BROWN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_BRICKS_SLAB, Blocks.WHITE_TERRACOTTA, 2);
// Brick Stairs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_BRICKS_STAIRS, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_BRICKS_STAIRS, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_BRICKS_STAIRS, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_BRICKS_STAIRS, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS, Blocks.WHITE_TERRACOTTA);

    //Polished Terracotta ect.
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_TERRACOTTA, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_RED_TERRACOTTA, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_ORANGE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_YELLOW_TERRACOTTA, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIME_TERRACOTTA, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GREEN_TERRACOTTA, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLUE_TERRACOTTA, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_CYAN_TERRACOTTA, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PURPLE_TERRACOTTA, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PINK_TERRACOTTA, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLACK_TERRACOTTA, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GRAY_TERRACOTTA, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BROWN_TERRACOTTA, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_WHITE_TERRACOTTA, Blocks.WHITE_TERRACOTTA);
// Polished Slabs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_TERRACOTTA_SLAB, Blocks.TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, 2);
// Polished Stairs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);

    //Terracotta Tiles ect.
// Tiles
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_TILES, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_TILES, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_TILES, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_TILES, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_TILES, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_TILES, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_TILES, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_TILES, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_TILES, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_TILES, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_TILES, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_TILES, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_TILES, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_TILES, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_TILES, Blocks.WHITE_TERRACOTTA);
// Tile Slabs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_TILES_SLAB, Blocks.TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_TILES_SLAB, Blocks.RED_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_TILES_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_TILES_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_TILES_SLAB, Blocks.LIME_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_TILES_SLAB, Blocks.GREEN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_TILES_SLAB, Blocks.BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_TILES_SLAB, Blocks.CYAN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_TILES_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_TILES_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_TILES_SLAB, Blocks.PINK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_TILES_SLAB, Blocks.BLACK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_TILES_SLAB, Blocks.GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_TILES_SLAB, Blocks.BROWN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_TILES_SLAB, Blocks.WHITE_TERRACOTTA, 2);
// Tile Stairs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_TILES_STAIRS, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_TILES_STAIRS, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_TILES_STAIRS, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_TILES_STAIRS, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_TILES_STAIRS, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_TILES_STAIRS, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_TILES_STAIRS, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_TILES_STAIRS, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_TILES_STAIRS, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_TILES_STAIRS, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_TILES_STAIRS, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_TILES_STAIRS, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_TILES_STAIRS, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_TILES_STAIRS, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_TILES_STAIRS, Blocks.WHITE_TERRACOTTA);

    //Shingles
        // Shingles
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_SHINGLES, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_SHINGLES, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_SHINGLES, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_SHINGLES, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_SHINGLES, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_SHINGLES, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_SHINGLES, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_SHINGLES, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_SHINGLES, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_SHINGLES, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_SHINGLES, Blocks.WHITE_TERRACOTTA);
// Shingle Slabs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_SHINGLES_SLAB, Blocks.TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_SHINGLES_SLAB, Blocks.RED_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_SHINGLES_SLAB, Blocks.LIME_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB, Blocks.GREEN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB, Blocks.BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB, Blocks.CYAN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_SHINGLES_SLAB, Blocks.PINK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB, Blocks.BLACK_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB, Blocks.GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB, Blocks.BROWN_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB, Blocks.WHITE_TERRACOTTA, 2);
// Shingle Stairs
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.TERRACOTTA_SHINGLES_STAIRS, Blocks.TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.RED_TERRACOTTA_SHINGLES_STAIRS, Blocks.RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS, Blocks.ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS, Blocks.YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS, Blocks.LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS, Blocks.GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS, Blocks.BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS, Blocks.CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS, Blocks.MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS, Blocks.PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS, Blocks.PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS, Blocks.BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS, Blocks.GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS, Blocks.BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HumbleBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS, Blocks.WHITE_TERRACOTTA);


        //Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, HumbleBlocks.TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_TERRACOTTA, HumbleBlocks.RED_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_TERRACOTTA, HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_TERRACOTTA, HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_TERRACOTTA, HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_TERRACOTTA, HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_TERRACOTTA, HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_TERRACOTTA, HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_TERRACOTTA, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_TERRACOTTA, HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_TERRACOTTA, HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_TERRACOTTA, HumbleBlocks.PINK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_TERRACOTTA, HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_TERRACOTTA, HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_TERRACOTTA, HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_TERRACOTTA, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_TERRACOTTA, HumbleBlocks.WHITE_TERRACOTTA_BRICKS);

        // Polished
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, HumbleBlocks.POLISHED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_TERRACOTTA, HumbleBlocks.POLISHED_RED_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_TERRACOTTA, HumbleBlocks.POLISHED_ORANGE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_TERRACOTTA, HumbleBlocks.POLISHED_YELLOW_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_TERRACOTTA, HumbleBlocks.POLISHED_LIME_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_TERRACOTTA, HumbleBlocks.POLISHED_GREEN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_TERRACOTTA, HumbleBlocks.POLISHED_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_TERRACOTTA, HumbleBlocks.POLISHED_CYAN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_TERRACOTTA, HumbleBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_TERRACOTTA, HumbleBlocks.POLISHED_MAGENTA_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_TERRACOTTA, HumbleBlocks.POLISHED_PURPLE_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_TERRACOTTA, HumbleBlocks.POLISHED_PINK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_TERRACOTTA, HumbleBlocks.POLISHED_BLACK_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_TERRACOTTA, HumbleBlocks.POLISHED_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_TERRACOTTA, HumbleBlocks.POLISHED_BROWN_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_TERRACOTTA, HumbleBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_TERRACOTTA, HumbleBlocks.POLISHED_WHITE_TERRACOTTA);

        // Tiles
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, HumbleBlocks.TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_TERRACOTTA, HumbleBlocks.RED_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_TERRACOTTA, HumbleBlocks.ORANGE_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_TERRACOTTA, HumbleBlocks.YELLOW_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_TERRACOTTA, HumbleBlocks.LIME_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_TERRACOTTA, HumbleBlocks.GREEN_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_TERRACOTTA, HumbleBlocks.BLUE_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_TERRACOTTA, HumbleBlocks.CYAN_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_TERRACOTTA, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_TERRACOTTA, HumbleBlocks.MAGENTA_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_TERRACOTTA, HumbleBlocks.PURPLE_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_TERRACOTTA, HumbleBlocks.PINK_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_TERRACOTTA, HumbleBlocks.BLACK_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_TERRACOTTA, HumbleBlocks.GRAY_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_TERRACOTTA, HumbleBlocks.BROWN_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_TERRACOTTA, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_TERRACOTTA, HumbleBlocks.WHITE_TERRACOTTA_TILES);

        // Shingles
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, HumbleBlocks.TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.RED_TERRACOTTA, HumbleBlocks.RED_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_TERRACOTTA, HumbleBlocks.ORANGE_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_TERRACOTTA, HumbleBlocks.YELLOW_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_TERRACOTTA, HumbleBlocks.LIME_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_TERRACOTTA, HumbleBlocks.GREEN_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_TERRACOTTA, HumbleBlocks.BLUE_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_TERRACOTTA, HumbleBlocks.CYAN_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_TERRACOTTA, HumbleBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_TERRACOTTA, HumbleBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_TERRACOTTA, HumbleBlocks.PURPLE_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_TERRACOTTA, HumbleBlocks.PINK_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_TERRACOTTA, HumbleBlocks.BLACK_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_TERRACOTTA, HumbleBlocks.GRAY_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_TERRACOTTA, HumbleBlocks.BROWN_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_TERRACOTTA, HumbleBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_TERRACOTTA, HumbleBlocks.WHITE_TERRACOTTA_SHINGLES);

    }
}
