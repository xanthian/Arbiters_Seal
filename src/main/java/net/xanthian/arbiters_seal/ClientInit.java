package net.xanthian.arbiters_seal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.entity.ModBoatEntities;
import net.xanthian.arbiters_seal.entity.ModMobEntities;
import net.xanthian.arbiters_seal.entity.item.model.ModBoatModel;
import net.xanthian.arbiters_seal.entity.mob.renderer.AeothRenderer;
import net.xanthian.arbiters_seal.entity.mob.renderer.VangalRenderer;
import net.xanthian.arbiters_seal.entity.mob.renderer.ZotzitRenderer;
import net.xanthian.arbiters_seal.items.tools.Bows;
import net.xanthian.arbiters_seal.items.tools.Crossbows;
import net.xanthian.arbiters_seal.particle.ModParticles;
import net.xanthian.arbiters_seal.particle.custom.SleepParticle;
import net.xanthian.arbiters_seal.entity.item.renderer.ModBlockEntityRenderer;
import net.xanthian.arbiters_seal.entity.item.renderer.ModBoatRenderer;

import static net.xanthian.arbiters_seal.util.ModPredicates.registerBowPredicates;
import static net.xanthian.arbiters_seal.util.ModPredicates.registerCrossbowPredicates;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(ModParticles.SLEEP_PARTICLE, SleepParticle.Factory::new);
        ModBoatModel.registerLayers();

        //Bows
        registerBowPredicates(Bows.COMPOSITE_BOW);
        registerBowPredicates(Bows.LONGBOW);
        registerBowPredicates(Bows.MACH_BOW);
        //registerBowPredicates(Bows.SHORTBOW);
        registerBowPredicates(Bows.SILVER_BOW);
        registerBowPredicates(Bows.TEORITE_BOW);
        registerBowPredicates(Bows.TRUE_FLIGHT);
        registerBowPredicates(Bows.WARBOW);
        registerBowPredicates(Bows.YOICHI_BOW);
        registerBowPredicates(Bows.DOMINANCE);

        //CROSSBOWS
        registerCrossbowPredicates(Crossbows.AEROLUS);
        registerCrossbowPredicates(Crossbows.AUTO_CROSSBOW);
        //registerCrossbowPredicates(Crossbows.CROSSBOW);
        registerCrossbowPredicates(Crossbows.EARTH_CROSSBOW);
        registerCrossbowPredicates(Crossbows.FIRE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.HEAVY_CROSSBOW);
        registerCrossbowPredicates(Crossbows.ICE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.QUARRELLER);
        registerCrossbowPredicates(Crossbows.SILVER_CROSSBOW);
        registerCrossbowPredicates(Crossbows.TEORITE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.THUNDER_CROSSBOW);
        registerCrossbowPredicates(Crossbows.WILLIAMS);

        // Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DENDRITE_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_DENDRITE_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MEDIUM_DENDRITE_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LARGE_DENDRITE_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALOE_VERA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANGEL_TEARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JAMMY_FRUIT_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ATTACHED_JAMMY_FRUIT_STEM, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModBoatEntities.BOAT.get(), context -> new ModBoatRenderer<>(context,false));
        EntityRendererRegistry.register(ModBoatEntities.CHEST_BOAT.get(), context -> new ModBoatRenderer<>(context, true));
        EntityRendererRegistry.register(ModMobEntities.ZOTZIT, ZotzitRenderer::new);
        EntityRendererRegistry.register(ModMobEntities.AEOTH, AeothRenderer::new);
        EntityRendererRegistry.register(ModMobEntities.VANGAL, VangalRenderer::new);
        ModBlockEntityRenderer.registerBlockEntityRenderer();
    }
}