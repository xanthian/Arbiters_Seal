package net.xanthian.arbiters_seal.items.armor.feet;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;

public class Riftwalkers extends ModFeetItem {
    public Riftwalkers(ArmorMaterial material) {
        super(material);
    }
    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
