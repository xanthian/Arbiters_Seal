package net.xanthian.arbiters_seal.items.armor.helmets;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.armor.ModHelmetItem;

public class SageHat extends ModHelmetItem {
    public SageHat(ArmorMaterial material) {
        super(material);
    }
    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }
}
