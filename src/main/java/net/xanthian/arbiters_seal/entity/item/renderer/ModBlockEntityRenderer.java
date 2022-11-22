package net.xanthian.arbiters_seal.entity.item.renderer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.xanthian.arbiters_seal.entity.ModBlockEntities;

public class ModBlockEntityRenderer {
    public static void registerBlockEntityRenderer() {
        BlockEntityRendererRegistry.register(ModBlockEntities.CHEST_BLOCK_ENTITY, ChestEntityRenderer::new);
    }
}