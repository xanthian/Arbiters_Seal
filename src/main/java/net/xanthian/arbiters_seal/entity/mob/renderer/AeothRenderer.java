package net.xanthian.arbiters_seal.entity.mob.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;
import net.xanthian.arbiters_seal.entity.mob.model.AeothModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AeothRenderer extends GeoEntityRenderer<AeothEntity> {

    public AeothRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new AeothModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public Identifier getTextureResource(AeothEntity object) {
        return new Identifier(Init.MOD_ID,"textures/entity/mob/aeoth.png");
    }
}