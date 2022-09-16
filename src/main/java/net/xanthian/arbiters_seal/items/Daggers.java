package net.xanthian.arbiters_seal.items;

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

import java.util.List;

public class Daggers {

    public static final Item DAGGER = registerItem("daggers/dagger", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A utilitarian knife for cooking,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("crafting, and the occasional").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("killing.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HIDDEN_KNIFE = registerItem("daggers/hidden_knife", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An assassin's last resort.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DIRK = registerItem("daggers/dirk", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A duelist's poniard, ideal for").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("targetting vulnerable spots.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EBONY_DAGGER = registerItem("daggers/ebony_dagger", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A black wood knife, to cut").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("through the night.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TONGUESLICER = registerItem("daggers/tongueslicer", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A torturer's blade, mean to cut").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("someone's screams short.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_DAGGER = registerItem("daggers/teorite_dagger", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blade pure enough to parry").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("curses.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MAIN_GAUCHE = registerItem("daggers/main_gauche", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An offhand weapon used to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("parry blows.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item KUNAI = registerItem("daggers/kunai", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An exotic knife able to cripple").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("almost any opponent.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item JANBIYA = registerItem("daggers/janbiya", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A short curved blade, fast and").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("cruel.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FLASH_KINFE = registerItem("daggers/flash_knife", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A light knife that flickers faster").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("than the eye can see.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WORM_TOOTH = registerItem("daggers/worm_tooth", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The tooth of a venomous").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("worm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DENDRITE_KNIFE = registerItem("daggers/dendrite_knife", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A knife of green crystal that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("inhibits blood clotting.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DRAGONS_NAIL = registerItem("daggers/dragons_nail", new ModDaggerItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The claw of a great dragon. A").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("single cut from this will kill").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("anyone in time.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerDaggerItems() {}
}