package net.xanthian.arbiters_seal.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;

import static net.minecraft.entity.effect.StatusEffects.REGENERATION;

public class HealthRegenEnchantment extends Enchantment {
    public HealthRegenEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient()) {
            ServerWorld world = (ServerWorld) user.world;
            if (!user.hasStatusEffect(REGENERATION)) {
                if (level == 1) {
                    user.addStatusEffect(new StatusEffectInstance(REGENERATION, 100, 0, true, false, true));
                }
                if (level == 2) {
                    user.addStatusEffect(new StatusEffectInstance(REGENERATION, 100, 1, true, false, true));
                }
                if (level == 3) {
                    user.addStatusEffect(new StatusEffectInstance(REGENERATION, 100, 2, true, false, true));
                }
            }
            super.onTargetDamaged(user, target, level);
        }
    }
}