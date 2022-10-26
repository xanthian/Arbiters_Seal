package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

public class Demoralizer extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (!user.getAbilities().creativeMode) {
                user.getStackInHand(hand).decrement(1);
            }
            entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DEF_DOWN, 1200, 0, false, false, true), user);
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 0, false, true, true), user);
        }
        entity.playSound(SoundEvents.ENTITY_TADPOLE_FLOP, 2.7f, 0.9f + (entity.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, user, entity, hand);
    }
}
