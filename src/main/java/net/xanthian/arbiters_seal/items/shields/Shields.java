package net.xanthian.arbiters_seal.items.shields;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModShieldMaterial;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class Shields {

    public static final Item BUCKLER = registerItem("shields/buckler", new ModShieldItem(1, ModShieldMaterial.WOOD){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Small target shield for archers").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("and fencers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BRONZE_SHIELD = registerItem("shields/bronze_shield", new ModShieldItem(1, ModShieldMaterial.BRONZE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Military shield, obsolete since").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("discovery of Bronze").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STEEL_SHIELD = registerItem("shields/steel_shield", new ModShieldItem(1, ModShieldMaterial.STEEL){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Shield used by knights and soldiers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GOLD_SHIELD = registerItem("shields/gold_shield", new ModShieldItem(1, ModShieldMaterial.GOLD){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Heavy shield with limited utility").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("against regular weapons.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WATER_SHIELD = registerItem("shields/water_shield", new ModShieldItem(1, ModShieldMaterial.SILVER){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blueish silver shield that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("turns cold into healing energy.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FIRE_SHIELD = registerItem("shields/fire_shield", new ModShieldItem(1, ModShieldMaterial.STEEL){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A red-tinted steel shield that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("turns heat into healing energy.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EARTH_SHIELD = registerItem("shields/earth_shield", new ModShieldItem(1, ModShieldMaterial.BRONZE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A dull bronze shield that draws").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("healing energies from the earth").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("itself.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item THUNDER_SHIELD = registerItem("shields/thunder_shield", new ModShieldItem(1, ModShieldMaterial.GOLD){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A glowing gold shield that turns").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("lightning into healing energy").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_SHIELD = registerItem("shields/teorite_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A shield made of teorite, powerful").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("against all forms of attacks.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item AEGIS_SHIELD = registerItem("shields/aegis_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blessed shield that is particularly").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("strong against magical attacks.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ARBITER_SHIELD = registerItem("shields/arbiter_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context){
            tooltip.add(Text.literal("A spiked shield that also protects").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("against many forms of injuries.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item MAGIC_SHIELD = registerItem("shields/magic_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A small buckler intended for wizards,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("to help with their offensive magic.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item VALIANT_SHIELD = registerItem("shields/valiant_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A very light shield used to deflect").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("blows rather than to block them.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item BEHEMOTH_GUARD = registerItem("shields/behemoth_guard", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The shield of a legendary giant:").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("merely holding it makes one stronger.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item CURSED_SHIELD = registerItem("shields/cursed_shield", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Only battle can appease the curse").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("on this shield.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item SHIELD_OF_THE_SIX = registerItem("shields/shield_of_the_six", new ModShieldItem(1, ModShieldMaterial.TEORITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A shield with unfathomable defensive").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("power.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.EPIC;
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerShieldItems() {}
}
