package net.xanthian.arbiters_seal.entity.armor.renderer;

import net.xanthian.arbiters_seal.entity.armor.model.WizardConeModel;
import net.xanthian.arbiters_seal.items.armor.helmets.WizardCone;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WizardConeRenderer extends GeoArmorRenderer<WizardCone> {
    public WizardConeRenderer() {
        super(new WizardConeModel());

        this.headBone = "armorHead";
    }

}
