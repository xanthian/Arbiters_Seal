package net.xanthian.arbiters_seal.util;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.armor.Feet;

public class EquippedArmors {


    public static boolean isWearingHoverBoots(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feet.HOVER_BOOTS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingJetBoots(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feet.JET_BOOTS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingRunningTreads(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feet.RUNNING_TREADS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingGremlinTreads(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feet.GREMLIN_TREADS)
        {
            return true;
        }
        return false;
    }
}
