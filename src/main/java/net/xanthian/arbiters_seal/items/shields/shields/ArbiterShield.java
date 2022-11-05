package net.xanthian.arbiters_seal.items.shields.shields;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.shields.ModShieldItem;
import net.xanthian.arbiters_seal.material.ModShieldTiers;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class ArbiterShield extends ModShieldItem {
    public ArbiterShield(ModShieldTiers tier) {
        super(tier);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.OFFHAND).isOf(this)) {
                if (player.getStatusEffect(ModStatusEffects.SILENCE) != null) {
                    player.removeStatusEffect(ModStatusEffects.SILENCE);
                }
                if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                    player.removeStatusEffect(StatusEffects.BLINDNESS);
                }
                if (player.getStatusEffect(StatusEffects.SLOWNESS) != null) {
                    player.removeStatusEffect(StatusEffects.SLOWNESS);
                }
            }
        }
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);
    }
}
