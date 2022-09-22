package net.xanthian.arbiters_seal.items.weapons;

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

public class Rods {

    public static final Item ROD = registerItem("rods/rod", new ModRodItem(ToolMaterials.WOOD, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A yard-long brass pole.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ANCIENT_ROD = registerItem("rods/ancient_rod", new ModRodItem(ToolMaterials.IRON, 1, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The scepter of a long-dead").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("emperor.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_ROD = registerItem("rods/silver_rod", new ModRodItem(ModToolMaterial.SILVER, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thick silver wand.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WATER_ROD = registerItem("rods/water_rod", new ModRodItem(ToolMaterials.IRON, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rod decorated with deep blue").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("sapphires, said to bolster one's").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("water affinity.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FIRE_ROD = registerItem("rods/fire_rod", new ModRodItem(ToolMaterials.IRON, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rod adorned with blood-red").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("rubies, said to bolster one's").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("fire affinity.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EARTH_ROD = registerItem("rods/earth_rod", new ModRodItem(ToolMaterials.IRON, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rod studded with shards of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("marble, said to bolster one's").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("earth affinity.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item THUNDER_ROD = registerItem("rods/thunder_rod", new ModRodItem(ToolMaterials.IRON, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rod covered in yellow topaz,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("said to bolster one's thunder").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("affinity.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_ROD = registerItem("rods/teorite_rod", new ModRodItem(ModToolMaterial.TEORITE, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An elaborate baton forged out").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of teorite.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EBONY_ROD = registerItem("rods/ebony_rod", new ModRodItem(ModToolMaterial.EBONY, 2, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The scepter of a detested").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("tyrant, said to bolster one's").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("dark affinity.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item JEWELED_ROD = registerItem("rods/jeweled_rod", new ModRodItem(ToolMaterials.GOLD, 5, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A golden rod topped with a").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("fist-sized diamond.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HEAVY_ROD = registerItem("rods/heavy_rod", new ModRodItem(ModToolMaterial.STEEL, 3, -2.1F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thick baton of solid steel,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("heavier than many maces.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GLACIER_ROD = registerItem("rods/glacier_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A shard of sapphire decorated").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("with snowflake carvings.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BLAZING_ROD = registerItem("rods/blazing_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Liquid magma kept in scepter").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("form by complex alchemical").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("processes.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item QUAKE_ROD = registerItem("rods/quake_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A delicate marble scepter, much").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("much heavier than it should be.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SURGE_ROD = registerItem("rods/surge_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A lightning rod still crackling").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("with the power of a summer").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("storm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item VOID_ROD = registerItem("rods/void_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A scepter enameled with regal").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("colors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item PRISM_ROD = registerItem("rods/prism_rod", new ModRodItem(ToolMaterials.IRON, 3, -1.9F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rod of solid gold, with a").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("with a headpiece assembled out of all").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("sorts of gems.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerRodItems() {}
}