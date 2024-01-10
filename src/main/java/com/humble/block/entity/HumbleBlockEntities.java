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
                            HumbleBlocks.TERRACOTTA_POT).build());

    public static void registerBlockEntities() {
        Humble.LOGGER.info("Registering Block Entities for " + Humble.MOD_ID);
    }
}
