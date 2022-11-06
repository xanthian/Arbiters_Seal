package net.xanthian.arbiters_seal.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.xanthian.arbiters_seal.items.RareItems;

public class AngelTearsBlock extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);

    public AngelTearsBlock() {
        super(FabricBlockSettings.copyOf(Blocks.CHORUS_PLANT).noCollision());
    }
    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.END_STONE);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public Item asItem() {
        return RareItems.ANGEL_TEARS;
    }
}