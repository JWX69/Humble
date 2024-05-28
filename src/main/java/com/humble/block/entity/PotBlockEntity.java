package com.humble.block.entity;

import com.humble.registry.PotColor;
import com.humble.registry.PotPattern;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.contents.NbtContents;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class PotBlockEntity extends BlockEntity {

    public PotPattern pattern = PotPattern.BLANK;
    public PotColor color = PotColor.TERRACOTTA;

    public PotBlockEntity(BlockPos pos, BlockState state) {
        super(HumbleBlockEntities.POT_BLOCK_ENTITY, pos, state);
    }


    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        compoundTag.putInt("Pattern", pattern.ordinal());
        compoundTag.putInt("Color", color.ordinal());
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        this.pattern = PotPattern.values()[compoundTag.getInt("Pattern")];
        this.color = PotColor.values()[compoundTag.getInt("Color")];
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }
}
