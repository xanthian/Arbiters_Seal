package net.xanthian.arbiters_seal.items.tools.maces;

import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.items.tools.ModMaceItem;

public class BattleMace extends ModMaceItem {
    public BattleMace(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public float getCrit() {
        return 0.03F;
    }
}