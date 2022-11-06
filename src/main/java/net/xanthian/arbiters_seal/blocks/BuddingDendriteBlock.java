package net.xanthian.arbiters_seal.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingDendriteBlock extends BuddingAmethystBlock {
    public BuddingDendriteBlock() {
        super(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST));
    }
    private static final Direction[] DIRECTIONS = Direction.values();

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.SMALL_DENDRITE_BUD;
            } else if (blockState.isOf(ModBlocks.SMALL_DENDRITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_DENDRITE_BUD;
            } else if (blockState.isOf(ModBlocks.MEDIUM_DENDRITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_DENDRITE_BUD;
            } else if (blockState.isOf(ModBlocks.LARGE_DENDRITE_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.DENDRITE_CLUSTER;
            }

            if (block != null) {
                BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(AmethystClusterBlock.FACING, direction)).with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, blockState2);
            }

        }
    }
}
