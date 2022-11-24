package net.xanthian.arbiters_seal.entity.armor.model;

import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.helmets.WitchCrown;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WitchCrownModel extends AnimatedGeoModel<WitchCrown> {

    @Override
    public Identifier getModelResource(WitchCrown object) {
        return new Identifier(Init.MOD_ID,"geo/helms/wizard.geo.json");
    }

    @Override
    public Identifier getTextureResource(WitchCrown object) {
        return new Identifier(Init.MOD_ID,"textures/entity/helms/witch_crown.png");
    }

    @Override
    public Identifier getAnimationResource(WitchCrown animatable) {
        return new Identifier(Init.MOD_ID,"animations/helms.animation.json");
    }
}
