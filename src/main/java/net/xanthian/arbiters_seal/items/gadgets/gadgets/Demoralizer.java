package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.EquipmentSlot;
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
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DEF_DOWN, 1200, 0, false, false, true), player);
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200, 0, false, true, true), player);
            if (!player.getAbilities().creativeMode) {
                stack.setDamage(stack.getDamage() + 1);
                if (stack.getDamage() > stack.getMaxDamage()) {
                    stack.setCount(0);
                }
            }
        }
        entity.playSound(SoundEvents.ENTITY_TADPOLE_FLOP, 2.7f, 0.9f + (entity.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, player, entity, hand);
    }
}
