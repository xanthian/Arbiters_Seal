package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

public class Impalotron extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            entity.damage(DamageSource.GENERIC, 5);
            if (!player.getAbilities().creativeMode) {
                stack.setDamage(stack.getDamage() + 1);
                if (stack.getDamage() > stack.getMaxDamage()) {
                    stack.setCount(0);
                }
            }
        }
        player.playSound(SoundEvents.ENTITY_ARROW_SHOOT, 2.7f, 0.1f + (player.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, player, entity, hand);
    }
}