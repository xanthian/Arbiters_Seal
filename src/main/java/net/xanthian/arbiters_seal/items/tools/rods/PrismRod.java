package net.xanthian.arbiters_seal.items.tools.rods;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModRodItem;

public class PrismRod extends ModRodItem {
    public PrismRod(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
}
