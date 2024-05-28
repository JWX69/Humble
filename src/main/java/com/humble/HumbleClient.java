package com.humble;

import com.humble.block.entity.HumbleBlockEntities;
import com.humble.block.entity.renderer.PotBlockRenderer;
import com.humble.registry.PotColor;
import com.humble.registry.PotPattern;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class HumbleClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(HumbleBlockEntities.POT_BLOCK_ENTITY, PotBlockRenderer::new);
        ModelLoadingPlugin.register(context -> context.addModels(PotBlockRenderer.MODEL_LOCATIONS));

    }
}
