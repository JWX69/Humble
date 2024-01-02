package com.humble.datagen;

import com.humble.block.HumbleBlocks;
import com.humble.item.HumbleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class HumbleModelProvider extends FabricModelProvider {
    public HumbleModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.CYAN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.MAGENTA_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.PURPLE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.PINK_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.BLACK_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.BROWN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(HumbleBlocks.WHITE_TERRACOTTA_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(HumbleItems.ROCK, Models.GENERATED);
    }
}
