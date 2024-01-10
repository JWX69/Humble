package com.humble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HumbleItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public HumbleItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

    }
}
