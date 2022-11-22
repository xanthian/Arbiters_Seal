package net.xanthian.arbiters_seal.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.entity.block.ModChestEntity;

public class ModBlockEntities {

    public static BlockEntityType<ModChestEntity> CHEST_BLOCK_ENTITY;

    public static void initialize() {
        CHEST_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "arbiters_seal:chest_be",
                FabricBlockEntityTypeBuilder.create(ModChestEntity::new, ModBlocks.EBONY_CHEST).build(null));
    }
}
