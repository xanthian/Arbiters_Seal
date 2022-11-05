package net.xanthian.arbiters_seal.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModBowTiers;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ModCrossbowItem extends CrossbowItem {
    private final ModBowTiers tier;
    private static final UUID CRIT_MODIFIER = UUID.fromString("07d9ffcb-26a9-414c-a193-f03af8ba3670");
    private static final UUID RANGE_MODIFIER = UUID.fromString("2e4a8d1c-42d4-4480-b4a4-e18142363903");
    private static final UUID DAMAGE_MODIFIER = UUID.fromString("91421633-d29d-44dc-ba40-8cc12b6f40d7");
    public float getCrit() {
        return 0f;
    }

    public ModCrossbowItem(ModBowTiers tier) {

        super(new FabricItemSettings().maxDamage(tier.getDurability()).group(Init.ARBITERS_SEAL_WEAPONS));
        this.tier = tier;
    }

    private PersistentProjectileEntity customArrow(PersistentProjectileEntity arrow) {
        arrow.setDamage(arrow.getDamage() + this.tier.getDamageBonus());
        return arrow;
    }

    @Override
    public int getRange() {
        return this.tier.getRangeBonus();
    }

    @Override
    public int getEnchantability() {
        return this.tier.getEnchantability();
    }

    @Override
    public boolean canRepair(ItemStack item, ItemStack repairItem) {
        return this.tier.getRepairIngredient().test(repairItem);
    }


    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String key = (stack.getTranslationKey() + ".tooltip");
        if (I18n.hasTranslation(key)) {
            String info = I18n.translate(key);
            String[] infoLines = info.split("\\r?\\n");

            for (String infoLine : infoLines) {
                tooltip.add(Text.literal(infoLine).formatted(Formatting.ITALIC, Formatting.GRAY));
            }
        } else {
            tooltip.add(Text.literal(I18n.translate(key).formatted(Formatting.ITALIC, Formatting.GRAY)));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack mainHand = attacker.getEquippedStack(EquipmentSlot.MAINHAND);
        if (mainHand.getItem() == this) {
            Random random = new Random();
            if (random.nextFloat() <= this.getCrit()) {
                float baseDamage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
                float extraDamageMultiplier = 1.5F;
                target.damage(DamageSource.GENERIC, (baseDamage * extraDamageMultiplier));
                target.world.playSound(null, target.getX(), target.getY(), target.getZ(), SoundEvents.ENTITY_PLAYER_ATTACK_CRIT,
                        SoundCategory.PLAYERS,1.0F,1.0F);
            }
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
        if (slot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.GENERIC_RANGE_BOOST, new EntityAttributeModifier(RANGE_MODIFIER, "crit increase", this.tier.getRangeBonus(),
                    EntityAttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.GENERIC_DAMAGE_BOOST, new EntityAttributeModifier(DAMAGE_MODIFIER, "crit increase", this.tier.getDamageBonus(),
                    EntityAttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.GENERIC_CRIT_BOOST, new EntityAttributeModifier(CRIT_MODIFIER, "crit increase", this.getCrit(),
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
}