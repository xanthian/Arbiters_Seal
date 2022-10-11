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

    private static final UUID[] MODIFIERS = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("aa94b3ab-f1a7-470b-9069-1ca3d61170e8"),
            UUID.fromString("ed8766a3-d548-43df-a311-78d3dfc089dd"),
            UUID.fromString("b8a90513-b39b-48d0-9926-1fa995919e9b"),
            UUID.fromString("83405039-5813-4be2-b826-198191ad0e87"),
            UUID.fromString("9df6b27a-4672-439f-bf2b-2dcf75726ff0"),
            UUID.fromString("5e132846-5cce-4694-bbe9-0f04e84a52bd"),
            UUID.fromString("102476bf-2f2b-47cb-979a-c9fe0fc52024"),
            UUID.fromString("6d57ca63-fa4b-450d-a0d2-a4a8719f1515"),
            UUID.fromString("82900317-ca7c-4ecf-8851-3af4dd0850c8"),
            UUID.fromString("ebbb2ed6-4af0-4f67-8e9b-8a6ba26fe21c"),
            UUID.fromString("dde7fa18-8533-490f-94e2-99717eb2a5e6"),
            UUID.fromString("c066c736-9ae3-4286-bd62-b3a6c4e4b1da"),
            UUID.fromString("fa727940-173f-44f2-a603-fd8e50121c42")
    };
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    public ModDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Init.ARBITERS_SEAL_WEAPONS));
        this.attributeModifiers = ImmutableMultimap.of(ReachEntityAttributes.ATTACK_RANGE,
                new EntityAttributeModifier(MODIFIERS[EquipmentSlot.MAINHAND.getEntitySlotId()],
                "Attack Range modifier", -1, EntityAttributeModifier.Operation.ADDITION));
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(slot);
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