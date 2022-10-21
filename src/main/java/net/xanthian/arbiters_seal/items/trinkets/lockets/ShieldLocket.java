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

public class ShieldLocket extends ModTrinketItem {

    private static final UUID DEFENCE_MODIFIER = UUID.fromString("55dba6d2-8a6f-4997-8ace-fc68f3d7fdbd");

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers =
                super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_ARMOR,
                new EntityAttributeModifier(DEFENCE_MODIFIER, "Armor", 1,
                        EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
