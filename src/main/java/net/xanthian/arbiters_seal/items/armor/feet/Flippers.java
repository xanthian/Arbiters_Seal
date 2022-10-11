package net.xanthian.arbiters_seal.items.armor.feet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.armor.Feet;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;

public class Flippers extends ModFeetItem {
    public Flippers(ArmorMaterial material) {
        super(material);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (feet.getItem() == Feet.FLIPPERS) {
                if (player.age % 180 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1, 0, false, false, true));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
