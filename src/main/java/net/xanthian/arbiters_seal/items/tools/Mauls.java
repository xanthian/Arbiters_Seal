package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.material.ModToolMaterial;

import java.util.List;

public class Mauls {

    public static final Item MAUL = registerItem("mauls/maul", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A heavy mining hammer.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SLEDGE = registerItem("mauls/sledge", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blacksmith's favorite tool").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_MAUL = registerItem("mauls/silver_maul", new ModMaulItem(ModToolMaterial.SILVER, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A maul of solid silver.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HIGH_STRIKER = registerItem("mauls/high_striker", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A regal hammer only used by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the strongest combatants.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_MAUL = registerItem("mauls/teorite_maul", new ModMaulItem(ModToolMaterial.TEORITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A teorite hammer used to forge").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("other teorite weapons.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GADA = registerItem("mauls/gada", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blunt spherical mace used by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("ancient warriors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item PESTILENCE = registerItem("mauls/pestilence", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A weapon imbued with many").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("curses").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CLOCKWORK_HAMMER = registerItem("mauls/clockwork_hammer", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A curious hammer enhanced by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("a mysterious mechanism").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FLATTENER = registerItem("mauls/flattener", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An oversized executioner's").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("maul").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });

    public static final Item BONECRUSHER = registerItem("mauls/bonecrusher", new ModMaulItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gigantic hammer made from").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the bones of a god").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
    });



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerMaulItems() {}
}