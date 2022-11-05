package net.xanthian.arbiters_seal.items.tools.scythes;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModScytheItem;

public class Reaper extends ModScytheItem {
    public Reaper(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

    @Override
    public float getCrit() {
        return 0.07F;
    }

    @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
