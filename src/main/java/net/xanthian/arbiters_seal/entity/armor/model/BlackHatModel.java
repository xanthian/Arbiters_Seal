package net.xanthian.arbiters_seal.entity.armor.model;

import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.helmets.BlackHat;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackHatModel extends AnimatedGeoModel<BlackHat> {

    @Override
    public Identifier getModelResource(BlackHat object) {
        return new Identifier(Init.MOD_ID,"geo/helms/wizard.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlackHat object) {
        return new Identifier(Init.MOD_ID,"textures/entity/helms/black_hat.png");
    }

    @Override
    public Identifier getAnimationResource(BlackHat animatable) {
        return new Identifier(Init.MOD_ID,"animations/helms.animation.json");
    }
}
