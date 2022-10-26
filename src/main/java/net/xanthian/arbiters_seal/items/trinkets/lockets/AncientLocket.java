package net.xanthian.arbiters_seal.items.trinkets.lockets;

import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.trinkets.ModTrinketItem;

import java.util.UUID;

public class AncientLocket extends ModTrinketItem {

    private static final UUID REACH_MODIFIER = UUID.fromString("c90ded9e-55bd-4404-85b0-dd6f7c98cfb5");

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers =
                super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(ReachEntityAttributes.REACH,
                new EntityAttributeModifier(REACH_MODIFIER, "Attack Damage", 2,
                        EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
