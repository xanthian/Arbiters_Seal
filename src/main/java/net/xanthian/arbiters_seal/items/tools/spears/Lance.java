package net.xanthian.arbiters_seal.items.tools.spears;

import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModSpearItem;

public class Lance extends ModSpearItem {
    public Lance(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public float getCrit() {
        return 0.03F;
    }
}
