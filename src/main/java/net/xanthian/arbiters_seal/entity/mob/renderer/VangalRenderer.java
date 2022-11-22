package net.xanthian.arbiters_seal.entity.mob.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.VangalEntity;
import net.xanthian.arbiters_seal.entity.mob.model.VangalModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VangalRenderer extends GeoEntityRenderer<VangalEntity> {

    public VangalRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new VangalModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public Identifier getTextureResource(VangalEntity object) {
        return new Identifier(Init.MOD_ID,"textures/entity/mob/vangal.png");
    }
}