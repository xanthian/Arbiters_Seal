package net.xanthian.arbiters_seal.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;

import java.util.List;

public class Bows {

    public static final Item SHORTBOW = registerItem("bows/shortbow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A horsemans bow.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item LONGBOW = registerItem("bows/longbow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A yew bow as tall as a man.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_BOW = registerItem("bows/silver_bow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A bow etched with silver engravings, humming with magical power.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item COMPOSITE_BOW = registerItem("bows/composite_bow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A powerful bow made of horn and wood.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_BOW = registerItem("bows/teorite_bow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A teorite bow that wards off enemy magic.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MACH_BOW = registerItem("bows/mach_bow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A light bow with an amazing rate of fire.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TRUE_FLIGHT = registerItem("bows/true_flight", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An enhanced recurve bow able to shoot almost as far as a gun.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WARBOW = registerItem("bows/warbow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A military bow for elite archers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item YOICHI_BOW = registerItem("bows/yoichi_bow", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A bow that uses barbed arrows to inflict horrible wounds.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item DOMINANCE = registerItem("bows/dominance", new ModBowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A fearsome weapon with arrows that always seek the heart.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    //public static final Item SIDEWINDER = registerItem("bows/sidewinder", new ModBowItem());
    //public static final Item WITHERING_LONGBOW = registerItem("bows/withering_longbow", new ModBowItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerBowItems() {}
}