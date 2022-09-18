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

public class Spears {

    public static final Item SPEAR = registerItem("spears/spear", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A standard military pike.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BOAR_SPEAR = registerItem("spears/boar_spear", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A broad-bladed hunting spear").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("to bring down big game.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_SPEAR = registerItem("spears/silver_spear", new ModSpearItem(ModToolMaterial.SILVER, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A spear decorated with silver").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("filigree.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ICESPIKE = registerItem("spears/icespike", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A pike infused with the bite of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("arctic winds.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FLAMESPIKE = registerItem("spears/flamespike", new ModSpearItem(ModToolMaterial.TEORITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A pike consumed with the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("hunger of a raging fire.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STONESPIKE = registerItem("spears/stonespike", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A pike that can cause the very").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("earth to quake.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BOLTSPIKE = registerItem("spears/boltspike", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A pike endowed with the fury").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of a lightning storm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_SPEAR = registerItem("spears/teorite_spear", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A teorite spear to pierce").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("through baneful hexes.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item LANCE = registerItem("spears/lance", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A heavy cavalry lance.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item PARTISAN = registerItem("spears/partisan", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A spear with defensive").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("protrusions to aid in parrying.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HEAVY_LANCE = registerItem("spears/heavy_lance", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An oversized lance for").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("ceremonial and intimidation").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("purposes.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GODRAY = registerItem("spears/godray", new ModSpearItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An awe-inspiring weapon that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("makes its wielder steadfast.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerSpearItems() {}
}