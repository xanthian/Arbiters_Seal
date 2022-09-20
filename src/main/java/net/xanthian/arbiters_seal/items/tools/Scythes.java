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

public class Scythes {

    public static final Item PLOW = registerItem("scythes/plow", new ModScytheItem(ToolMaterials.IRON, 3, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A peasant's tool, scorned by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("by real warriors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SCYTHE = registerItem("scythes/scythe", new ModScytheItem(ToolMaterials.IRON, 3, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A scythe built for battle.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_SCYTHE = registerItem("scythes/silver_scythe", new ModScytheItem(ModToolMaterial.SILVER, 6, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A silver-bladed scythe to hack").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the undead apart.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CRIMSON_SCYTHE = registerItem("scythes/crimson_scythe", new ModScytheItem(ToolMaterials.IRON, 4, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Stained by the blood of its").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("victims, this scythe has a dark").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("past.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_SCYTHE = registerItem("scythes/teorite_scythe", new ModScytheItem(ModToolMaterial.TEORITE, 4, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This teorite scythe will sweep").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("spells away.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FAUCHARD = registerItem("scythes/fauchard", new ModScytheItem(ToolMaterials.DIAMOND, 4, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A long-bladed polearm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ENERGY_SCYTHE = registerItem("scythes/energy_scythe", new ModScytheItem(ToolMaterials.DIAMOND, 3, -3.1F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A magical staff bearing a blade").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of pure energy.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item KAMAITACHI = registerItem("scythes/kamaitachi", new ModScytheItem(ToolMaterials.NETHERITE, 3, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An exotic weapon designed to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("rip flesh from bone.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DAYS_HARVEST = registerItem("scythes/days_harvest", new ModScytheItem(ToolMaterials.NETHERITE, 4, -3.3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This strange weapon inflicts").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("surprisingly deep cuts.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item REAPER = registerItem("scythes/reaper", new ModScytheItem(ToolMaterials.NETHERITE, 5, -3.5F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This glowing scythe cuts").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("through the darkness to find its").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("prey.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerScytheItems() {}
}