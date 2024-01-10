package com.humble.block.entity;

import com.humble.Humble;
import com.humble.registry.HumbleBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HumbleBlockEntities {
    public static final BlockEntityType<PotBlockEntity> POT_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Humble.MOD_ID, "pot_be"),
                    FabricBlockEntityTypeBuilder.create(PotBlockEntity::new,
                            HumbleBlocks.TERRACOTTA_POT).build());

    public static void registerBlockEntities() {
        Humble.LOGGER.info("Registering Block Entities for " + Humble.MOD_ID);
    }
}
