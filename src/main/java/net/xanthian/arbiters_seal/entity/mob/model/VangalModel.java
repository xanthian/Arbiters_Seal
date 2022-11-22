package net.xanthian.arbiters_seal.entity.mob.model;

import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.entity.mob.VangalEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VangalModel extends AnimatedGeoModel<VangalEntity> {

    @Override
    public Identifier getModelResource(VangalEntity object) {
        return new Identifier(Init.MOD_ID,"geo/vangal.geo.json");
    }

    @Override
    public Identifier getTextureResource(VangalEntity object) {
        return new Identifier(Init.MOD_ID,"textures/entity/mob/vangal.png");
    }

    @Override
    public Identifier getAnimationResource(VangalEntity animatable) {
        return new Identifier(Init.MOD_ID,"animations/vangal.animation.json");
    }
}