package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

public class Healbot3000 extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            entity.heal(4);
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 220, 0, false, true, true));
            if (!player.getAbilities().creativeMode) {
                stack.setDamage(stack.getDamage() + 1);
                if (stack.getDamage() > stack.getMaxDamage()) {
                    stack.setCount(0);
                }
            }
        }
        player.playSound(SoundEvents.BLOCK_BELL_RESONATE, 0.3f, 0.1f + (player.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, player, entity, hand);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (Screen.hasShiftDown()) {
            if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
                player.heal(4);
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 220, 0, false, false, true));
            }
            if (!player.getAbilities().creativeMode) {
                ItemStack stack = player.getStackInHand(hand);
                stack.setDamage(stack.getDamage() + 1);
                if (stack.getDamage() > stack.getMaxDamage()) {
                    stack.setCount(0);
                }
            }
        }
            player.playSound(SoundEvents.BLOCK_BEACON_ACTIVATE, 0.7f, 0.1f + (player.getRandom().nextFloat() * 0.2f));
        return super.use(world, player, hand);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
