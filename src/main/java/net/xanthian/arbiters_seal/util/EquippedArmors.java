package net.xanthian.arbiters_seal.util;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.arbiters_seal.items.armor.Feets;

public class EquippedArmors {

    public static boolean isWearingFlippers(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feets.FLIPPERS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingHoverBoots(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feets.HOVER_BOOTS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingJetBoots(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feets.JET_BOOTS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingRunningTreads(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feets.RUNNING_TREADS)
        {
            return true;
        }
        return false;
    }

    public static boolean isWearingGremlinTreads(PlayerEntity player)
    {
        ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
        if(feet.getItem() == Feets.GREMLIN_TREADS)
        {
            return true;
        }
        return false;
    }
}
