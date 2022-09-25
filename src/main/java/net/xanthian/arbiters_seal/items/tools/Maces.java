package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

import java.util.List;

public class Maces {

    public static final Item MACE = registerItem("maces/mace", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A wooden cudgel to break").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("bones.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item THUMPER = registerItem("maces/thumper", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A lightweight morningstar").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_MACE = registerItem("maces/silver_mace", new ModMaceItem(ModToolMaterial.SILVER, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A mace inscribed with silver").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("runes granting resistance").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("against poison.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BATTLEMACE = registerItem("maces/battlemace", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The claw of a great dragon. A").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("single cut from this will kill").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ENERGY_MACE = registerItem("maces/energy_mace", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A spiked mace mainly used by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("soldiers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_MACE = registerItem("maces/teorite_mace", new ModMaceItem(ModToolMaterial.TEORITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A mace glowing with mystical").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("powers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HOLY_MACE = registerItem("maces/holy_mace", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blessed mace destined to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("obliterate evil.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GOEDENDAG = registerItem("maces/goedendag", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A spiked club to ensure your").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("enemies don't have a great day.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item PERNACH = registerItem("maces/pernach", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A flanged mace to smash").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("through heavy armor and").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("defensive enchantments.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SKULLCRUSHER = registerItem("maces/skullcrusher", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A vicious morningstar with").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("particularly sharp spikes.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GODS_MESSENGER = registerItem("maces/gods_messenger", new ModMaceItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A glorious scepter, lighter than").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("a feather.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerMaceItems() {}
}