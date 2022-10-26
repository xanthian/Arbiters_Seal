package net.xanthian.arbiters_seal.items.tools.maces;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModMaceItem;

public class GodsMessenger extends ModMaceItem {
    public GodsMessenger(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
