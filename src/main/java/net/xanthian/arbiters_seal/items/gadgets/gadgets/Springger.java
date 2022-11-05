package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

public class Springger extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (!user.getAbilities().creativeMode) {
                user.getStackInHand(hand).decrement(1);
            }
            entity.takeKnockback(1, user.getX() - entity.getX(), user.getZ() - entity.getZ());
            entity.damage(DamageSource.MAGIC,2);
        }
        user.playSound(SoundEvents.BLOCK_PACKED_MUD_HIT, 2.7f, 0.1f + (user.getRandom().nextFloat() * 0.2f));
        return super.useOnEntity(stack, user, entity, hand);
    }
}