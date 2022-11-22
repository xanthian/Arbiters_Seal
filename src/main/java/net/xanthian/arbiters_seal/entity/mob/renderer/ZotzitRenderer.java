package net.xanthian.arbiters_seal.entity.mob.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.ZotzitEntity;
import net.xanthian.arbiters_seal.entity.mob.model.ZotzitModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ZotzitRenderer extends GeoEntityRenderer<ZotzitEntity> {

    public ZotzitRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ZotzitModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public Identifier getTextureResource(ZotzitEntity object) {
        return new Identifier(Init.MOD_ID,"textures/entity/mob/zotzit.png");
    }
}