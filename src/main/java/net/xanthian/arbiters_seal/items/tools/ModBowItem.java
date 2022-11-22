package net.xanthian.arbiters_seal.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModBowTiers;
import net.xanthian.arbiters_seal.util.ModAttributes;

import java.util.List;
import java.util.Random;
import java.util.UUID;

// Credit to mpbb Ironbows mod for code + idea

public class ModBowItem extends BowItem {
    private final ModBowTiers tier;
    private static final UUID CRIT_MODIFIER = UUID.fromString("9a20c4bb-fe0c-461d-808a-d01d8ae1e563");
    private static final UUID RANGE_MODIFIER = UUID.fromString("b464a84a-602f-4bd4-bfe1-cd910e373ade");
    private static final UUID DAMAGE_MODIFIER = UUID.fromString("3f62a33a-8cab-46bc-bdc0-9d5235a0a23e");

    public float getCrit() {
        return 0f;
    }

    public ModBowItem(ModBowTiers tier) {
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
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        boolean bl2;
        int i;
        float f;
        if (!(user instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity playerEntity = (PlayerEntity)user;
        boolean bl = playerEntity.getAbilities().creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
        ItemStack itemStack = playerEntity.getArrowType(stack);
        if (itemStack.isEmpty() && !bl) {
            return;
        }
        if (itemStack.isEmpty()) {
            itemStack = new ItemStack(Items.ARROW);
        }
        if ((double)(f = BowItem.getPullProgress(i = this.getMaxUseTime(stack) - remainingUseTicks)) < 0.1) {
            return;
        }
        boolean bl3 = bl2 = bl && itemStack.isOf(Items.ARROW);
        if (!world.isClient) {
            int k;
            int j;
            ArrowItem arrowItem = (ArrowItem)(itemStack.getItem() instanceof ArrowItem ? itemStack.getItem() : Items.ARROW);
            PersistentProjectileEntity persistentProjectileEntity = arrowItem.createArrow(world, itemStack, playerEntity);
            persistentProjectileEntity.setVelocity(playerEntity, playerEntity.getPitch(), playerEntity.getYaw(), 0.0f, f * 3.0f, 1.0f);
            if (f == 1.0f) {
                persistentProjectileEntity.setCritical(true);
            }
            if ((j = EnchantmentHelper.getLevel(Enchantments.POWER, stack)) > 0) {
                persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() + (double)j * 0.5 + 0.5);
            }
            if ((k = EnchantmentHelper.getLevel(Enchantments.PUNCH, stack)) > 0) {
                persistentProjectileEntity.setPunch(k);
            }
            if (EnchantmentHelper.getLevel(Enchantments.FLAME, stack) > 0) {
                persistentProjectileEntity.setOnFireFor(100);
            }
            stack.damage(1, playerEntity, p -> p.sendToolBreakStatus(playerEntity.getActiveHand()));
            if (bl2 || playerEntity.getAbilities().creativeMode && (itemStack.isOf(Items.SPECTRAL_ARROW) || itemStack.isOf(Items.TIPPED_ARROW))) {
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
            }
            world.spawnEntity(customArrow(persistentProjectileEntity));
        }
        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0f, 1.0f / (world.getRandom().nextFloat() * 0.4f + 1.2f) + f * 0.5f);
        if (!bl2 && !playerEntity.getAbilities().creativeMode) {
            itemStack.decrement(1);
            if (itemStack.isEmpty()) {
                playerEntity.getInventory().removeOne(itemStack);
            }
        }
        playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String key = (stack.getTranslationKey() + ".tooltip");
        if (I18n.hasTranslation(key)) {
            String info = I18n.translate(key);
            String[] infoLines = info.split("\\r?\\n");

            for (String infoLine : infoLines) {
                tooltip.add(Text.literal(infoLine).formatted(Formatting.ITALIC, Formatting.DARK_AQUA));
            }
        } else {
            tooltip.add(Text.literal(I18n.translate(key).formatted(Formatting.ITALIC, Formatting.DARK_AQUA)));
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
            builder.put(ModAttributes.GENERIC_RANGE_BOOST, new EntityAttributeModifier(RANGE_MODIFIER, "range increase", this.tier.getRangeBonus(),
                    EntityAttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.GENERIC_DAMAGE_BOOST, new EntityAttributeModifier(DAMAGE_MODIFIER, "dmg increase", this.tier.getDamageBonus(),
                    EntityAttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.GENERIC_CRIT_BOOST, new EntityAttributeModifier(CRIT_MODIFIER, "crit increase", this.getCrit(),
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }
}