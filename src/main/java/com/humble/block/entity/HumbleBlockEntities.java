package com.humble.block.entity;

import com.humble.Humble;
import com.humble.registry.HumbleBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class HumbleBlockEntities {
    public static final BlockEntityType<PotBlockEntity> POT_BLOCK_ENTITY =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(Humble.MOD_ID, "pot_be"),
                    FabricBlockEntityTypeBuilder.create(PotBlockEntity::new,
                            HumbleBlocks.TERRACOTTA_POT,
                            HumbleBlocks.RED_TERRACOTTA_POT,
                            HumbleBlocks.ORANGE_TERRACOTTA_POT,
                            HumbleBlocks.YELLOW_TERRACOTTA_POT,
                            HumbleBlocks.LIME_TERRACOTTA_POT,
                            HumbleBlocks.GREEN_TERRACOTTA_POT,
                            HumbleBlocks.BLUE_TERRACOTTA_POT,
                            HumbleBlocks.CYAN_TERRACOTTA_POT,
                            HumbleBlocks.LIGHT_BLUE_TERRACOTTA_POT,
                            HumbleBlocks.MAGENTA_TERRACOTTA_POT,
                            HumbleBlocks.PURPLE_TERRACOTTA_POT,
                            HumbleBlocks.PINK_TERRACOTTA_POT,
                            HumbleBlocks.BLACK_TERRACOTTA_POT,
                            HumbleBlocks.GRAY_TERRACOTTA_POT,
                            HumbleBlocks.BROWN_TERRACOTTA_POT,
                            HumbleBlocks.LIGHT_GRAY_TERRACOTTA_POT,
                            HumbleBlocks.WHITE_TERRACOTTA_POT
                    ).build());

    public static void registerBlockEntities() {
        Humble.LOGGER.info("Registering Block Entities for " + Humble.MOD_ID);
    }
}
