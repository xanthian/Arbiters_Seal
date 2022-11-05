package net.xanthian.arbiters_seal.items.shields.shields;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.shields.ModShieldItem;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

public class AegisShield extends ModShieldItem {
    public AegisShield(ModShieldTiers tier) {
        super(tier);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                if (player.age % 180 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 220, 0, true, false, true));
                }
            }
        }
    }

}