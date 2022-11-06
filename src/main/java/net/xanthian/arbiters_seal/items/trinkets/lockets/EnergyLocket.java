package net.xanthian.arbiters_seal.items.trinkets.lockets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.UUID;

public class EnergyLocket extends ModTrinketItem {

    private static final UUID EXP_BOOST_MODIFIER = UUID.fromString("adf7ca4b-5c04-4162-b98f-58aa11c9bce3");

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers =
                super.getModifiers(stack, slot, entity, uuid);
            modifiers.put(ModAttributes.GENERIC_EXP_BOOST,
                    new EntityAttributeModifier(EXP_BOOST_MODIFIER, "Exp Increase", 1,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return modifiers;
    }
}