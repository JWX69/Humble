package com.humble.item;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.humble.registry.HumbleBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

import java.util.Map;

public class RockItem extends Item {
    public RockItem(Item.Properties settings) {
        super(settings);
    }

    protected static final Map<Block, BlockState> PATH_STATES = Maps.newHashMap(new ImmutableMap.Builder<Block, BlockState>().put(Blocks.DIRT_PATH, HumbleBlocks.COBBLED_PATH.defaultBlockState()).build());

    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (context.getClickedFace() != Direction.DOWN) {
            Player playerEntity = context.getPlayer();
            BlockState blockState2 = PATH_STATES.get(blockState.getBlock());
            BlockState blockState3 = null;
            if (blockState2 != null && world.getBlockState(blockPos.above()).isAir()) {
                world.playSound(playerEntity, blockPos, SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0f, 1.0f);
                blockState3 = blockState2;
            }
            if (blockState3 != null) {
                if (!world.isClientSide) {
                    world.setBlock(blockPos, blockState3, Block.UPDATE_ALL | Block.UPDATE_IMMEDIATE);
                    world.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(playerEntity, blockState3));
                    if (playerEntity != null) {
                        context.getItemInHand().hurtAndBreak(1, playerEntity, p -> p.broadcastBreakEvent(context.getHand()));
                    }
                }
                return InteractionResult.sidedSuccess(world.isClientSide);
            }
            return InteractionResult.PASS;
        }
        return InteractionResult.PASS;
    }
}
