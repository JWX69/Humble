package com.humble.block;

import com.humble.block.entity.PotBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class PotBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape POT = Block.createCuboidShape(1,0,1,15,12,15);
    private static final VoxelShape COLLAR = Block.createCuboidShape(3,12,3,13,13,13);
    private static final VoxelShape LIP = Block.createCuboidShape(2,13,2,14,15,14);
    private static final VoxelShape SHAPE = VoxelShapes.union(POT, COLLAR, LIP);

    public PotBlock(Settings settings) {
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
        return new PotBlockEntity(pos, state);
    }
}
