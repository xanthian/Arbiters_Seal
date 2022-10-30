package net.xanthian.arbiters_seal.items.tools.bows;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;
import net.xanthian.arbiters_seal.items.tools.ModBowItem;
import net.xanthian.arbiters_seal.material.ModBowTiers;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.Random;
import java.util.UUID;

public class Dominance extends ModBowItem {
    public Dominance(ModBowTiers tier) {
        super(tier);
    }
    private static final UUID CRIT_MODIFIER = UUID.fromString("e14602fe-f61d-4f9e-8e6c-cade62ecbc13");
    float critChance = 0.1F;

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            Random random = new Random();
            if (random.nextFloat() <= critChance) {
                float baseDamage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
                float extraDamageMultiplier = 1.5F;
                target.damage(DamageSource.GENERIC, (baseDamage * extraDamageMultiplier));
                target.world.playSound(null, target.getX(), target.getY(), target.getZ(), SoundEvents.ENTITY_PLAYER_ATTACK_CRIT,
                        SoundCategory.PLAYERS,1.0F,1.0F);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
            builder.put(ModAttributes.GENERIC_CRIT_BOOST, new EntityAttributeModifier(CRIT_MODIFIER, "crit increase", critChance,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return builder.build();
    }

        @Override
        public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }
}
