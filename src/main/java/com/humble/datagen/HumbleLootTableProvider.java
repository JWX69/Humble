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
        addDrop(HumbleBlocks.COBBLED_PATH);
        //Terracotta Bricks
        addDrop(HumbleBlocks.TERRACOTTA_BRICKS);
        addDrop(HumbleBlocks.RED_TERRACOTTA_BRICKS);
        addDrop(HumbleBlocks.ORANGE_TERRACOTTA_BRICKS);
        addDrop(HumbleBlocks.YELLOW_TERRACOTTA_BRICKS);
        addDrop(HumbleBlocks.LIME_TERRACOTTA_BRICKS);
        addDrop(HumbleBlocks.GREEN_TERRACOTTA_BRICKS);

        //Terracotta Brick Slab
        addDrop(HumbleBlocks.TERRACOTTA_BRICKS_SLAB, slabDrops(HumbleBlocks.TERRACOTTA_BRICKS_SLAB));
    }
}
