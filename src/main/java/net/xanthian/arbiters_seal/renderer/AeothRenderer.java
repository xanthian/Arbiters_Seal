package net.xanthian.arbiters_seal.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.entity.mob.AeothEntity;
import net.xanthian.arbiters_seal.entity.mob.AeothEntityModel;

@Environment(EnvType.CLIENT)
public class AeothRenderer extends MobEntityRenderer<AeothEntity, AeothEntityModel<AeothEntity>> {
    private static final Identifier TEXTURE = new Identifier("arbiters_seal:textures/entity/aeoth.png");

    public AeothRenderer(EntityRendererFactory.Context context) {
        super(context, new AeothEntityModel(context.getPart(EntityModelLayers.BLAZE)), 0.5F);
    }

    @Override
    public Identifier getTexture(AeothEntity entity) {
        return TEXTURE;
    }

}
