package net.xanthian.arbiters_seal.entity.armor.model;

import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.armor.helmets.WizardCone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WizardConeModel extends AnimatedGeoModel<WizardCone> {

    @Override
    public Identifier getModelResource(WizardCone object) {
        return new Identifier(Init.MOD_ID,"geo/helms/wizard.geo.json");
    }

    @Override
    public Identifier getTextureResource(WizardCone object) {
        return new Identifier(Init.MOD_ID,"textures/entity/helms/wizard_cone.png");
    }

    @Override
    public Identifier getAnimationResource(WizardCone animatable) {
        return new Identifier(Init.MOD_ID,"animations/helms.animation.json");
    }
}
