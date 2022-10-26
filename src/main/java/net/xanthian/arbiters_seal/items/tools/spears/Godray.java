package net.xanthian.arbiters_seal.items.tools.spears;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModSpearItem;

public class Godray extends ModSpearItem {
    public Godray(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
