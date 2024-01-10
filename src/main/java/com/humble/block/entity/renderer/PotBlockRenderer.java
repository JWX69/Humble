package com.humble.block.entity.renderer;

import com.humble.block.entity.PotBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class PotBlockRenderer implements BlockEntityRenderer<PotBlockEntity> {

    @Environment(EnvType.CLIENT)
    public PotBlockRenderer(BlockEntityRendererProvider.Context context) {

    }


    @Override
    public void render(PotBlockEntity entity, float tickDelta, PoseStack matrices, MultiBufferSource vertexConsumers, int light, int overlay) {

    }
}
