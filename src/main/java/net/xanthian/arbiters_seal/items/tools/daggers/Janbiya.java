package net.xanthian.arbiters_seal.items.tools.daggers;

import net.minecraft.item.ToolMaterial;

import net.xanthian.arbiters_seal.items.tools.ModDaggerItem;

public class Janbiya extends ModDaggerItem {
    public Janbiya(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public float getCrit() {
        return 0.03F;
    }
}
