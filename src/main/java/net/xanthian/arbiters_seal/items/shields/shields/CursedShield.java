package net.xanthian.arbiters_seal.items.shields.shields;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.shields.ModShieldItem;
import net.xanthian.arbiters_seal.material.ModShieldTiers;

import java.util.UUID;

public class CursedShield extends ModShieldItem {

    private static final UUID ATTACK_DAMANGE_MODIFIER = UUID.fromString("a12dfe41-d73f-43d1-b88f-e255cf76bbed");
    private static final UUID MOVE_SPEED_MODIFIER = UUID.fromString("3304a8b7-f49f-4a26-9e0b-a8aa7d1e6cd2");
    private static final UUID LUCK_MODIFIER = UUID.fromString("68dfe0ee-5706-4bd4-a478-57475d5d46d6");
    private static final UUID HEALTH_MODIFIER = UUID.fromString("c4ad6e06-36ef-4943-ad91-1dc1091cfdb6");

    public CursedShield(ModShieldTiers tier) {
        super(tier);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if(slot == EquipmentSlot.MAINHAND || slot == EquipmentSlot.OFFHAND) {
            builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMANGE_MODIFIER, "Attack damage reduction", -4, EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(MOVE_SPEED_MODIFIER, "Move speed reduction", -0.15000000596046448, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
            builder.put(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier(LUCK_MODIFIER, "Luck reduction", -1, EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(HEALTH_MODIFIER, "Health reduction", -2, EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();

    }


}
