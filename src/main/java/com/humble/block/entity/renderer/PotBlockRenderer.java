package com.humble.block.entity.renderer;

import com.humble.Humble;
import com.humble.block.entity.PotBlockEntity;
import com.humble.registry.PotColor;
import com.humble.registry.PotPattern;
import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Locale;

public class PotBlockRenderer implements BlockEntityRenderer<PotBlockEntity> {

    public static final ResourceLocation[] MODEL_LOCATIONS;

    static {
        PotPattern[] patterns = PotPattern.values();
        PotColor[] colors = PotColor.values();
        MODEL_LOCATIONS = new ResourceLocation[patterns.length * colors.length];
        for(PotPattern pattern : patterns) {
            for(PotColor color : colors) {
                MODEL_LOCATIONS[getIndex(pattern, color)] = Humble.path("block/patterns/%s/%s".formatted(color.name().toLowerCase(Locale.ROOT), pattern.name().toLowerCase(Locale.ROOT)));
            }
        }
    }

    private static int getIndex(PotPattern pattern, PotColor color) {
        return pattern.ordinal() * PotColor.values().length + color.ordinal();
    }

    @Environment(EnvType.CLIENT)
    public PotBlockRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(PotBlockEntity entity, float tickDelta, PoseStack matrices, MultiBufferSource vertexConsumers, int light, int overlay) {
        matrices.pushPose();

        BakedModel model = Minecraft.getInstance().getModelManager().getModel(MODEL_LOCATIONS[getIndex(entity.pattern, entity.color)]);

        Level level = entity.getLevel();
        BlockState blockState = entity.getBlockState();
        BlockPos blockPos = entity.getBlockPos();
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().tesselateBlock(level, model, blockState, blockPos, matrices, vertexConsumers.getBuffer(RenderType.cutout()), true, level.random, 42, OverlayTexture.NO_OVERLAY);

        matrices.popPose();
    }
}
