package net.xanthian.arbiters_seal.entity.armor.renderer;

import net.xanthian.arbiters_seal.entity.armor.model.WitchCrownModel;
import net.xanthian.arbiters_seal.items.armor.helmets.WitchCrown;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WitchCrownRenderer extends GeoArmorRenderer<WitchCrown> {
    public WitchCrownRenderer() {
        super(new WitchCrownModel());

        this.headBone = "armorHead";
    }

}
