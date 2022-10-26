package net.xanthian.arbiters_seal.items.tools.rapiers;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModRapierItem;

public class DelChliss extends ModRapierItem {
    public DelChliss(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
}
