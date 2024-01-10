package com.humble;

import com.humble.block.entity.HumbleBlockEntities;
import com.humble.block.entity.renderer.PotBlockRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.util.Identifier;

public class HumbleClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(HumbleBlockEntities.POT_BLOCK_ENTITY, PotBlockRenderer::new);
        ModelLoadingPlugin.register(context -> {
            context.addModels(Humble.path("models/block/patterns/lines"));
        });
    }
}
