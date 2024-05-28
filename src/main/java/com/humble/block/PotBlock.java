package com.humble.block;

import com.humble.block.entity.PotBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PotBlock extends BaseEntityBlock implements EntityBlock {
    private static final VoxelShape POT = Block.box(1, 0, 1, 15, 12, 15);
    private static final VoxelShape COLLAR = Block.box(3, 12, 3, 13, 14, 13);
    private static final VoxelShape LIP = Block.box(2, 13, 2, 14, 16, 14);
    private static final VoxelShape SHAPE = Shapes.or(POT, COLLAR, LIP);

    public PotBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PotBlockEntity(pos, state);
    }
}
