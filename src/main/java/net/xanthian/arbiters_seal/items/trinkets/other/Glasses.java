package net.xanthian.arbiters_seal.items.trinkets.other;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

public class Glasses extends ModTrinketItem {

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,999999999,0,false, false,true));
        }
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.NIGHT_VISION) != null) {
                player.removeStatusEffect(StatusEffects.NIGHT_VISION);
            }
        }
        super.onUnequip(stack, slot, entity);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.DARKNESS) != null) {
                player.removeStatusEffect(StatusEffects.DARKNESS);
            }
            if (player.getStatusEffect(StatusEffects.BLINDNESS) != null) {
                player.removeStatusEffect(StatusEffects.BLINDNESS);
            }
            super.tick(stack, slot, entity);
        }
    }
}