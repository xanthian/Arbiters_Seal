package net.xanthian.arbiters_seal.status_effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.xanthian.arbiters_seal.util.ModAttributes;

public class SleepStatusEffect extends StatusEffect {
    public SleepStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 8100544);
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "62D96224-CD0D-4889-B6C7-1200AA12B5E9",
                        -500.0, EntityAttributeModifier.Operation.ADDITION)

                .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "9F8137A1-E577-4B0D-BC8A-40453A15B394",
                        -500.0, EntityAttributeModifier.Operation.ADDITION)

                .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "59ED1A7C-0584-494D-B82F-FE251AE06C6C",
                        -500.0, EntityAttributeModifier.Operation.ADDITION)

                .addAttributeModifier(ModAttributes.GENERIC_JUMP_BOOST,"6efa139f-9310-4855-b3bb-218355fe0a30",
                        -500.0, EntityAttributeModifier.Operation.ADDITION);
    }

}