package com.humble.datagen;

import com.humble.registry.HumbleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class HumbleLootTableProvider extends FabricBlockLootTableProvider {
    public HumbleLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(HumbleBlocks.COBBLED_PATH);
        //Terracotta Bricks
        dropSelf(HumbleBlocks.TERRACOTTA_BRICKS);
        dropSelf(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        dropSelf(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        dropSelf(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        dropSelf(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        dropSelf(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);

        //Terracotta Brick Slab
        add(HumbleBlocks.TERRACOTTA_BRICKS_SLAB, createSlabItemTable(HumbleBlocks.TERRACOTTA_BRICKS_SLAB));
    }
}
