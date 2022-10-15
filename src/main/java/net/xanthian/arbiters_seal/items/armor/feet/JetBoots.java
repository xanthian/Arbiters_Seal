package net.xanthian.arbiters_seal.items.armor.feet;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.items.armor.ModFeetItem;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.Random;
import java.util.UUID;

public class JetBoots extends ModFeetItem {
    public JetBoots(ArmorMaterial material) {
        super(material);
    }

    private static final UUID JUMP_BOOST_MODIFIER = UUID.fromString("5c0ac2f7-530d-4361-9311-ee2fc7a06fd0");

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if (slot == EquipmentSlot.FEET) {
            builder.put(ModAttributes.GENERIC_JUMP_BOOST,
                    new EntityAttributeModifier(JUMP_BOOST_MODIFIER, "Jump Increase", 0.5,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
            if (feet.getItem() == this && !player.isTouchingWater()) {
                if (player.age % 180 == 0) {
                    Random random = new Random();
                    if (random.nextFloat() <= 0.25f) {
                        if (!player.isOnGround()) {
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 3, false, false, true));
                        }
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
