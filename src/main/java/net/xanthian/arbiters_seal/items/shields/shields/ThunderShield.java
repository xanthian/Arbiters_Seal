package net.xanthian.arbiters_seal.items.shields.shields;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.shields.ModShieldItem;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

public class ThunderShield  extends ModShieldItem {
    public ThunderShield(ModShieldTiers tier) {
        super(tier);
    }
    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}