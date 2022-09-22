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

public class Rapiers {

    public static final Item FLEURET = registerItem("rapiers/fleuret", new ModRapierItem(ToolMaterials.IRON, 1, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gentlemans weapon,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("more for show than battle.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item RAPIER = registerItem("rapiers/rapier", new ModRapierItem(ToolMaterials.IRON, 1, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A bravo's dueling sabre.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_RAPIER = registerItem("rapiers/silver_rapier", new ModRapierItem(ModToolMaterial.SILVER, 4, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blade of metal so pure").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("that is cleanses the users blood.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SHINING_RAPIER = registerItem("rapiers/shining_rapier", new ModRapierItem(ToolMaterials.GOLD, 4, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rapier so brilliant that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("even blind men can see it.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_RAPIER = registerItem("rapiers/teorite_rapier", new ModRapierItem(ModToolMaterial.TEORITE, 1, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Stylish enough to inspire").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("banter from the shyest of warriors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item POISE = registerItem("rapiers/poise", new ModRapierItem(ToolMaterials.IRON, 3, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Even the most savage brutes").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("look dignified with this blade.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item JOYEUSE = registerItem("rapiers/joyeuse", new ModRapierItem(ToolMaterials.IRON, 3, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A rapier as exuberant as the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("wildest revel.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MONARCH = registerItem("rapiers/monarch", new ModRapierItem(ToolMaterials.DIAMOND, 3, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An emporer's sabre of office.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DEL_CHLISS = registerItem("rapiers/del_chliss", new ModRapierItem(ToolMaterials.NETHERITE, 3, -2.0F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A magical foil that drains").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("strength with a mere touch.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerRapierItems() {}
}