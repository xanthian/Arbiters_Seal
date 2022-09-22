package net.xanthian.arbiters_seal.items.weapons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

public class ModDaggerItem extends SwordItem {
    public ModDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);

        if ((mainHand.getItem() == Daggers.DIRK)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(StatusEffects.BLINDNESS) == null || target.getStatusEffect(StatusEffects.BLINDNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.TONGUESLICER)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getType() == EntityType.GHAST || target.getType() == EntityType.BLAZE || target.getType() == EntityType.GUARDIAN) {
                    if (target.getStatusEffect(ModStatusEffects.MUTE) == null || target.getStatusEffect(ModStatusEffects.MUTE).getDuration() < 20) {
                        target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MUTE, 200, 0, true, true, true), target);
                    }
                }
            }
        }

        if ((mainHand.getItem() == Daggers.TEORITE_DAGGER)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(ModStatusEffects.ROOT) == null || target.getStatusEffect(ModStatusEffects.ROOT).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ROOT, 100, 5, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.KUNAI)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(StatusEffects.WEAKNESS) == null || target.getStatusEffect(StatusEffects.WEAKNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 3, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.WORM_TOOTH)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.75f) {
                if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.DENDRITE_KNIFE)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.75f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.DRAGONS_NAIL)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
                    if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0, true, true, true), target);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
}