package net.xanthian.arbiters_seal.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.status_effects.ModStatusEffects;

import java.util.List;
import java.util.Random;
import java.util.UUID;


public class ModDaggerItem extends SwordItem {

    private static final UUID REACH_MODIFIER = UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B");
    private static final UUID ATTACK_RANGE_MODIFIER = UUID.fromString("aa94b3ab-f1a7-470b-9069-1ca3d61170e8");

    public ModDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if(slot == EquipmentSlot.MAINHAND) {
            builder.put(ReachEntityAttributes.REACH, new EntityAttributeModifier(REACH_MODIFIER, "Dagger reach reduction", -2f, EntityAttributeModifier.Operation.ADDITION));
            builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier(ATTACK_RANGE_MODIFIER, "Dagger attack range reduction", -2f, EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (mainHand.getItem() == Daggers.DIRK) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(StatusEffects.BLINDNESS) == null || target.getStatusEffect(StatusEffects.BLINDNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0, true, true, true), target);
                }
            }
        }

        if ((mainHand.getItem() == Daggers.TONGUESLICER)) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getType() == EntityType.GHAST || target.getType() == EntityType.BLAZE || target.getType() == EntityType.GUARDIAN) {
                    if (target.getStatusEffect(ModStatusEffects.MUTE) == null || target.getStatusEffect(ModStatusEffects.MUTE).getDuration() < 20) {
                        target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MUTE, 200, 0, true, true, true), target);
                    }
                }
            }
        }

        if (mainHand.getItem() == Daggers.TEORITE_DAGGER) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(ModStatusEffects.ROOT) == null || target.getStatusEffect(ModStatusEffects.ROOT).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ROOT, 100, 5, true, true, true), target);
                }
            }
        }

        if (mainHand.getItem() == Daggers.KUNAI) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(StatusEffects.WEAKNESS) == null || target.getStatusEffect(StatusEffects.WEAKNESS).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 3, true, true, true), target);
                }
            }
        }

        if (mainHand.getItem() == Daggers.WORM_TOOTH) {
            Random random = new Random();
            if (random.nextFloat() <= 0.75f) {
                if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0, true, true, true), target);
                }
            }
        }

        if (mainHand.getItem() == Daggers.DENDRITE_KNIFE) {
            Random random = new Random();
            if (random.nextFloat() <= 0.75f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
            }
        }

        if (mainHand.getItem() == Daggers.DRAGONS_NAIL) {
            Random random = new Random();
            if (random.nextFloat() <= 0.62f) {
                if (target.getStatusEffect(ModStatusEffects.BLEED) == null || target.getStatusEffect(ModStatusEffects.BLEED).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEED, 200, 0, true, true, true), target);
                }
                    if (target.getStatusEffect(StatusEffects.POISON) == null || target.getStatusEffect(StatusEffects.POISON).getDuration() < 20) {
                    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0, true, true, true), target);
                }
            }
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String key = (stack.getTranslationKey() + ".tooltip");
        if (I18n.hasTranslation(key)) {
            String info = I18n.translate(key);
            String[] infoLines = info.split("\\r?\\n");

            for (String infoLine : infoLines) {
                tooltip.add(1, Text.literal(infoLine).formatted(Formatting.ITALIC, Formatting.GRAY));
            }
        } else {
            tooltip.add(Text.literal(I18n.translate(key).formatted(Formatting.ITALIC, Formatting.GRAY)));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}