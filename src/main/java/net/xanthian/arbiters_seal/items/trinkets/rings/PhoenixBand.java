package net.xanthian.arbiters_seal.items.trinkets.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class PhoenixBand extends ModTrinketItem {

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(ModStatusEffects.REBIRTH,999999999,0,false, false,true));
        }
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(ModStatusEffects.REBIRTH) != null)
                player.removeStatusEffect(ModStatusEffects.REBIRTH);
        }
        super.onUnequip(stack, slot, entity);
    }

    private boolean tryUseRing(DamageSource source, LivingEntity entity, PlayerEntity player) {
        if (source.isOutOfWorld()) {
            return false;
        } else {
            ItemStack itemStack = null;
            Hand[] var4 = Hand.values();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Hand hand = var4[var6];
                ItemStack itemStack2 = player.getStackInHand(hand);
                if (itemStack2.isOf(Items.TOTEM_OF_UNDYING)) {
                    itemStack = itemStack2.copy();
                    itemStack2.decrement(1);
                    break;
                }
            }

            if (itemStack != null) {
                if (player instanceof ServerPlayerEntity) {
                    ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)player;
                    serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(Items.TOTEM_OF_UNDYING));
                    Criteria.USED_TOTEM.trigger(serverPlayerEntity, itemStack);
                }

                player.setHealth(1.0F);
                player.clearStatusEffects();
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
                player.world.sendEntityStatus(player, (byte)35);
            }

            return itemStack != null;
        }
    }
}