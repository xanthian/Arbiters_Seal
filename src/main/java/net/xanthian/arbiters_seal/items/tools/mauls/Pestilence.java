package net.xanthian.arbiters_seal.items.tools.mauls;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModMaulItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

public class Pestilence extends ModMaulItem {
    public Pestilence(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if (mainHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.SLOWNESS) == null || target.getStatusEffect(StatusEffects.SLOWNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(StatusEffects.WEAKNESS) == null || target.getStatusEffect(StatusEffects.WEAKNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 0, true, true, true), target);
                }
            }
            if (random.nextFloat() <= 0.35f) {
                if (target.getStatusEffect(ModStatusEffects.ROOT) == null || target.getStatusEffect(ModStatusEffects.ROOT).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ROOT, 100, 0, true, true, true), target);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }

        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
}
