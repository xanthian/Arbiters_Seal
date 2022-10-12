package net.xanthian.arbiters_seal.items.armor.feet;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorMaterial;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;

import java.util.UUID;

public class RunningTreads extends ModFeetItem {

    private static final UUID SPEED_MODIFIER = UUID.fromString("314323f0-9fb5-4ad3-b94d-eff97daa3b47");

    public RunningTreads(ArmorMaterial material) {
        super(material);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if(slot == EquipmentSlot.FEET) {
            builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                    new EntityAttributeModifier(SPEED_MODIFIER, "Speed Increase", 0.10000000298023224,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
}
