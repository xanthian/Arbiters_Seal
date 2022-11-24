package net.xanthian.arbiters_seal.entity.armor.renderer;

import net.xanthian.arbiters_seal.entity.armor.model.BlackHatModel;
import net.xanthian.arbiters_seal.items.armor.helmets.BlackHat;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackHatRenderer extends GeoArmorRenderer<BlackHat> {
    public BlackHatRenderer() {
        super(new BlackHatModel());

        this.headBone = "armorHead";
    }

}
