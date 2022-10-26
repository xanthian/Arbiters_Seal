package net.xanthian.arbiters_seal.items.tools.staffs;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModStaffItem;

public class Godsleg extends ModStaffItem {
    public Godsleg(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
}
