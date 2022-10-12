package net.xanthian.arbiters_seal.items.armor.chestpieces;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.armor.ModChestItem;

public class DarksilkRobe  extends ModChestItem {
    public DarksilkRobe(ArmorMaterial material) {
        super(material);
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
