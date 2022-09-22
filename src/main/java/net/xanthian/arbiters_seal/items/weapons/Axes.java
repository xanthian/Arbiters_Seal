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

public class Axes {

    public static final Item AXE = registerItem("axes/axe", new ModAxeItem(ToolMaterials.IRON, 2, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A simple woodcutter's axe.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BATTLEAXE = registerItem("axes/battleaxe", new ModAxeItem(ToolMaterials.IRON, 2, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A heavy steel axe built to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("cleave through mail and flesh").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("alike.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_AXE = registerItem("axes/silver_axe", new ModAxeItem(ModToolMaterial.SILVER, 5, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blessed axe made of silver, to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("hunt creatures of the night.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CHOPPER = registerItem("axes/chopper", new ModAxeItem(ToolMaterials.IRON, 3, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A deceptively powerful").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("hatchet.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_AXE = registerItem("axes/teorite_axe", new ModAxeItem(ModToolMaterial.TEORITE, 3, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A teorite adze able to hack").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("enchantments apart.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BLOOD_AXE = registerItem("axes/blood_axe", new ModAxeItem(ToolMaterials.IRON, 3, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Used to behead vampires long").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("ago, it now steals the life of its").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("victims.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item MARAUDER_AXE = registerItem("axes/marauder_axe", new ModAxeItem(ToolMaterials.DIAMOND, 4, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A tribal weapons, used to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("destroy fortifications.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ORNATE_AXE = registerItem("axes/ornate_axe", new ModAxeItem(ToolMaterials.GOLD, 6, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gilded axe inlaid with gaudy").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("jewels. Surprisingly efficient.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DARK_REIGN = registerItem("axes/dark_reign", new ModAxeItem(ToolMaterials.DIAMOND, 5, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A demonic axe that feeds upon").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the darkness.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EXECUTIONER = registerItem("axes/executioner", new ModAxeItem(ToolMaterials.DIAMOND, 5, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An oversized axe to slay").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("criminals in one blow.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CRY_HAVOC = registerItem("axes/cry_havoc", new ModAxeItem(ToolMaterials.NETHERITE, 6, -3.2F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("As light as a feather, as").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("powerful as a titan's maul.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerAxeItems() {}
}