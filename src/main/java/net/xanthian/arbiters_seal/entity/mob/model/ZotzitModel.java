package net.xanthian.arbiters_seal.entity.mob.model;

import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.ZotzitEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ZotzitModel extends AnimatedGeoModel<ZotzitEntity> {

    @Override
    public Identifier getModelResource(ZotzitEntity object) {
        return new Identifier(Init.MOD_ID,"geo/zotzit.geo.json");
    }

    @Override
    public Identifier getTextureResource(ZotzitEntity object) {
        return new Identifier(Init.MOD_ID,"textures/entity/mob/zotzit.png");
    }

    @Override
    public Identifier getAnimationResource(ZotzitEntity animatable) {
        return new Identifier(Init.MOD_ID,"animations/zotzit.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(ZotzitEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}