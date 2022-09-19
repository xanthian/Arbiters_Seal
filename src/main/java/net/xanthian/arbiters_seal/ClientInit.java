package net.xanthian.arbiters_seal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.tools.Bows;

import static net.xanthian.arbiters_seal.renderer.ModPredicates.registerBowPredicates;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Bows
        registerBowPredicates(Bows.COMPOSITE_BOW);
        registerBowPredicates(Bows.LONGBOW);
        registerBowPredicates(Bows.MACH_BOW);
        registerBowPredicates(Bows.SHORTBOW);
        registerBowPredicates(Bows.SILVER_BOW);
        registerBowPredicates(Bows.TEORITE_BOW);
        registerBowPredicates(Bows.TRUE_FLIGHT);
        registerBowPredicates(Bows.WARBOW);
        registerBowPredicates(Bows.YOICHI_BOW);
        registerBowPredicates(Bows.DOMINANCE);

        // Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_TRAPDOOR, RenderLayer.getCutout());

                    // Crossbows
    }
}