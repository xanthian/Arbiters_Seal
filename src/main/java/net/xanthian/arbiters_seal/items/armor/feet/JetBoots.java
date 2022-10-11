package net.xanthian.arbiters_seal.items.armor.feet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.armor.Feet;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;

import java.util.Random;

public class JetBoots extends ModFeetItem {
    public JetBoots(ArmorMaterial material) {
        super(material);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (feet.getItem() == Feet.JET_BOOTS && !player.isTouchingWater()) {
                if (player.age % 180 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 3, false, false, true));
                    Random random = new Random();
                    if (random.nextFloat() <= 0.025f) {
                        if (!player.isOnGround()) {
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 3, false, false, true));
                        }
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
