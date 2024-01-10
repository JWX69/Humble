package com.humble.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class PotteryTableBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape TOP = Block.createCuboidShape(0,11,0,16,16,16);
    private static final VoxelShape LEGS = Block.createCuboidShape(1,0,1,15,11,15);
    private static final VoxelShape SHAPE = VoxelShapes.union(TOP, LEGS);
    public PotteryTableBlock(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
