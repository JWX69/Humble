package com.humble.datagen;

import com.humble.Humble;
import com.humble.block.HumbleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class HumbleLootTableProvider extends FabricBlockLootTableProvider {
    public HumbleLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(HumbleBlocks.COBBLED_PATH);
    }
}
