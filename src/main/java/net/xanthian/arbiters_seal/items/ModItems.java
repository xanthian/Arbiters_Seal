package net.xanthian.arbiters_seal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.blocks.ModBlocks;

import java.util.List;

public class ModItems {

// BRONZE
    public static final Item BRONZE_INGOT = registerItem("materials/bronze_ingot", new ModMaterialsItem());

// SILVER
    public static final Item RAW_SILVER = registerItem("materials/raw_silver", new ModMaterialsItem());
    public static final Item SILVER_INGOT = registerItem("materials/silver_ingot", new ModMaterialsItem());

// STEEL
    public static final Item STEEL_INGOT = registerItem("materials/steel_ingot", new ModMaterialsItem());

// TEORITE
    public static final Item RAW_TEORITE = registerItem("materials/raw_teorite", new ModMaterialsItem());
    public static final Item TEORITE_INGOT = registerItem("materials/teorite_ingot", new ModMaterialsItem());

// DENDRITE
    public static final Item DENDRITE_CRYSTAL = registerItem("materials/dendrite_crystal", new ModMaterialsItem());

// Other Materials
    public static final Item SNAKEBITE_OIL = registerItem("materials/snakebite_oil", new ModMaterialsItem());
    public static final Item SHELLAC_POWDER = registerItem("materials/shellac_powder", new ModMaterialsItem());
    public static final Item AMMONIAC_GUM = registerItem("materials/ammoniac_gum", new ModMaterialsItem());
    public static final Item CATALYST = registerItem("materials/catalyst", new ModMaterialsItem());
    public static final Item COBBLEWEED_POD = registerItem("materials/cobbleweed_pod", new ModMaterialsItem());
    public static final Item DISTILLED_WATER = registerItem("materials/distilled_water", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The clearest of water, devoid").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of impurities.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item ALOE_LEAF = registerItem("materials/snakebite_oil", new ModMaterialsItem());
    public static final Item MYCOLEATHER = registerItem("materials/mycoleather", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A surprisingly sturdy and pliable").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("vegetal leather made from mushroom").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("caps.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item JAMMY_FRUIT = registerItem("materials/jammy_fruit", new ModMaterialsItem());
    public static final Item SINEWDLE_FRUIT = registerItem("materials/sinewdle_fruit", new ModMaterialsItem());
    public static final Item METEORITE = registerItem("materials/meteorite", new ModMaterialsItem());
    public static final Item DRAGONSBLOOD_SAP = registerItem("materials/dragonsblood_sap", new ModMaterialsItem());
    public static final Item ENERGIZED_CRYSTAL = registerItem("materials/energized_crystal", new ModMaterialsItem());
    public static final Item ANGEL_TEARS = registerItem("materials/angel_tears", new ModMaterialsItem());
    public static final Item DORMANT_CRYSTAL = registerItem("materials/dormant_crystal", new ModMaterialsItem());
    public static final Item CORONAL_PLUME = registerItem("materials/coronal_plume", new ModMaterialsItem());
    public static final Item COLD_IRON_INGOT = registerItem("materials/cold_iron_ingot", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Rare and difficult to work,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("this metal has many mystical").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("properties.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DARK_CORE = registerItem("materials/dark_core", new ModMaterialsItem());
    public static final Item QUALITY_THREAD = registerItem("materials/quality_thread", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A fine silk thread used in").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("high-quality priests' garments.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item ADAMANT_INGOT = registerItem("materials/adamant_ingot", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A priceless legendary metal.").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("Anything crafted of this metal").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("will be of truly remarkable quality.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item AEGISITE_INGOT = registerItem("materials/aegisite_ingot", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A metal with impressive deflective").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("properties.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item DEMON_LEATHER = registerItem("materials/demon_leather", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A skin worn by demon slayers,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("it repels the creatures of the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("dark.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item PLATINUM_THREAD = registerItem("materials/platinum_thread", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This most precious of threads is").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("used in the weaving of garments that").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("transcend the limits of beauty.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item MYTHICAL_LEATHER = registerItem("materials/mythical_leather", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Leather from a legendary creature,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("still brimming with its power.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item DIAMOND_THREAD = registerItem("materials/diamond_thread", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An exceedingly resilient thread").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("that never breaks down.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item GOLD_THREAD = registerItem("materials/gold_thread", new ModMaterialsItem(){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A fine chain of gold for making").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("magic amulets.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});
    public static final Item GODWOOD = registerItem("materials/godwood", new ModMaterialsItem());
    public static final Item TARNISHED_CORE = registerItem("materials/tarnished_core", new ModMaterialsItem());


    //Random Stuff
    public static final Item EBONY_SIGN = registerItem("objects/ebony_sign",
            new SignItem(new FabricItemSettings().group(Init.ARBITERS_SEAL_ITEMS).maxCount(16), ModBlocks.EBONY_SIGN_BLOCK, ModBlocks.EBONY_WALL_SIGN_BLOCK));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerModItems() {}
}
