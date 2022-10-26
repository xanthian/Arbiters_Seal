package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.Random;

public class Electroconstrictor extends ModGadgetItem {


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (!user.getAbilities().creativeMode) {
                user.getStackInHand(hand).decrement(1);
            }
            Random random = new Random();
            if (random.nextFloat() <= 0.5f) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ROOT, 1200, 0, false, true, true), user);
            }
            entity.damage(DamageSource.MAGIC,entity.getMaxHealth()/4);
        }
        user.playSound(SoundEvents.BLOCK_BLASTFURNACE_FIRE_CRACKLE, 2.7f, 0.1f + (user.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, user, entity, hand);
    }
}
