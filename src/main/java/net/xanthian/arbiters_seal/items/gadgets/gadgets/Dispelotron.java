package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

import java.util.List;

public class Dispelotron extends ModGadgetItem {

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(this)) {
            List<StatusEffect> list = entity.getActiveStatusEffects().keySet().stream().filter(effect ->
                    effect.getCategory() == (StatusEffectCategory.BENEFICIAL)).toList();
            list.forEach(entity::removeStatusEffect);
        }
        return super.useOnEntity(stack, player, entity, hand);
    }
}
