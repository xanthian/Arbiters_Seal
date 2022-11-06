package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;
import net.xanthian.arbiters_seal.sounds.ModSounds;

import java.util.Random;

public class SurpriserPlus extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            entity.damage(DamageSource.MAGIC, 3);
            Random random = new Random();
            if (random.nextFloat() <= 0.5f) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1200, 0, false, true, true), player);
            }

            if (!player.getAbilities().creativeMode) {
                stack.setDamage(stack.getDamage() + 1);
                if (stack.getDamage() > stack.getMaxDamage()) {
                    stack.setCount(0);
                }
            }
        }
        player.playSound(ModSounds.SPRINGGER, 0.5f, 0.5f + (player.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, player, entity, hand);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
