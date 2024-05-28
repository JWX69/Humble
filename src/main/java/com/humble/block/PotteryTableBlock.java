package com.humble.block;

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

public class PotteryTableBlock extends BaseEntityBlock implements EntityBlock {
    private static final VoxelShape TOP = Block.box(0,11,0,16,16,16);
    private static final VoxelShape LEG1 = Block.box(1, 0, 1, 5, 11, 5);
    private static final VoxelShape LEG2 = Block.box(11, 0, 1, 15, 11, 5);
    private static final VoxelShape LEG3 = Block.box(11, 0, 11, 15, 11, 15);
    private static final VoxelShape LEG4 = Block.box(1, 0, 11, 5, 11, 15);
    private static final VoxelShape SHAPE = Shapes.or(TOP, LEG1, LEG2, LEG3, LEG4);

    public PotteryTableBlock(Properties settings) {
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
        return null;
    }
}
