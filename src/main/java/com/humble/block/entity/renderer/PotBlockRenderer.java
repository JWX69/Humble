package com.humble.block.entity.renderer;

import com.humble.block.entity.PotBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.client.util.math.MatrixStack;

public class PotBlockRenderer implements BlockEntityRenderer<PotBlockEntity> {

    @Environment(EnvType.CLIENT)
    public PotBlockRenderer(BlockEntityRendererFactory.Context context) {

    }


    @Override
    public void render(PotBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

    }
}
