package net.xanthian.arbiters_seal.items.weapons;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;

import java.util.List;

public class Crossbows {

    public static final Item CROSSBOW = registerItem("crossbows/crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A simple hunting weapon.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HEAVY_CROSSBOW = registerItem("crossbows/heavy_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A crank-operated battle").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("crossbow.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ICE_CROSSBOW = registerItem("crossbows/ice_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A magical crossbow that shoots").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("icicles.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_CROSSBOW = registerItem("crossbows/silver_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A heavy crossbow with silver").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("inlays.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FIRE_CROSSBOW = registerItem("crossbows/fire_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A light crossbow with bolts that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("that turn into meteors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item AUTO_CROSSBOW = registerItem("crossbows/auto_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The trademark weapon of an").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("ancient king, it fires a volley of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("bolts.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_CROSSBOW = registerItem("crossbows/teorite_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A teorite crossbow that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("protects against baneful magic.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EARTH_CROSSBOW = registerItem("crossbows/earth_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A light crossbow that fires hard").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("granite bolts.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item THUNDER_CROSSBOW = registerItem("crossbows/thunder_crossbow", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A crossbow that shoots").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("lightning bolts.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item QUARRELLER = registerItem("crossbows/quarreller", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An ebony crossbow with bolts").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("that drive their target insane.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item AEROLUS = registerItem("crossbows/aerolus", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A crossbow made entirely of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("steel, granting it unrivaled").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("power.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WILLIAMS = registerItem("crossbows/williams", new ModCrossbowItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List< Text > tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A marksman's weapon with").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("unbelievable accuracy.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerCrossbowItems() {}
}