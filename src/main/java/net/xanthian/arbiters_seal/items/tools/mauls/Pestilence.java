package net.xanthian.arbiters_seal.items.tools.mauls;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModMaulItem;

public class Pestilence extends ModMaulItem {
    public Pestilence(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }

        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
