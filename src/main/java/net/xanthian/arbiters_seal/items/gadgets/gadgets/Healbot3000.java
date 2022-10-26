package net.xanthian.arbiters_seal.items.gadgets.gadgets;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.gadgets.ModGadgetItem;

public class Healbot3000 extends ModGadgetItem {

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!player.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (!player.getAbilities().creativeMode) {
                player.getStackInHand(hand).decrement(1);
            }
            player.heal(4);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0, false, true, true));
        }
            player.playSound(SoundEvents.ENTITY_TADPOLE_FLOP, 2.7f, 0.1f + (player.getRandom().nextFloat() * 0.2f));
        return super.use(world, player, hand);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
