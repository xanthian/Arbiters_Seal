package net.xanthian.arbiters_seal.items.tools.scythes;

import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModScytheItem;

public class Kamaitachi extends ModScytheItem {
    public Kamaitachi(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public float getCrit() {
        return 0.03F;
    }
}
