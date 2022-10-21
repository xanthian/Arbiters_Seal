package net.xanthian.arbiters_seal.items.trinkets.lockets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

import java.util.UUID;

public class ZephyrLocket extends ModTrinketItem {

    private static final UUID MOVE_SPEED_MODIFIER = UUID.fromString("115dbf6f-d64b-43ff-a1de-bb5f80893410");

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers =
                super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                new EntityAttributeModifier(MOVE_SPEED_MODIFIER, "Movement Speed", 0.05,
                        EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
