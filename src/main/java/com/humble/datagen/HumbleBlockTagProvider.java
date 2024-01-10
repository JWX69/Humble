package com.humble.datagen;

import com.humble.registry.HumbleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class HumbleBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public HumbleBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL).add(HumbleBlocks.COBBLED_PATH);
    }
}
