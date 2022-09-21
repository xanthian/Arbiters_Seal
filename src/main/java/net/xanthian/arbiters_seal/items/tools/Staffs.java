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

public class Staffs {

    public static final Item WOOD_STAFF = registerItem("staffs/wood_staff", new ModStaffItem(ToolMaterials.IRON, 1, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Just a regular wooden stick.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WHITE_STAFF = registerItem("staffs/white_staff", new ModStaffItem(ToolMaterials.IRON, 1, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A staff carved out of pure").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("alabaster, blessed by a very").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("vocal priest.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_STAFF = registerItem("staffs/silver_staff", new ModStaffItem(ModToolMaterial.SILVER, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A straight staff with a silver").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("headpiece.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HEALING_STAFF = registerItem("staffs/healing_staff", new ModStaffItem(ToolMaterials.IRON, 2, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A staff that heals wounds with").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("a mere touch.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item HEAVY_STAFF = registerItem("staffs/heavy_staff", new ModStaffItem(ToolMaterials.IRON, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An ornate quarterstaff.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_STAFF = registerItem("staffs/teorite_staff", new ModStaffItem(ModToolMaterial.TEORITE, 2, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This teorite staff will sweep").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("spells away.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GOLD_STAFF = registerItem("staffs/gold_staff", new ModStaffItem(ToolMaterials.GOLD, 4, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gaudy staff with golden").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("decorations.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BLACK_STAFF = registerItem("staffs/black_staff", new ModStaffItem(ModToolMaterial.EBONY, 2, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A charred wood staff of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("unknown origin.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GATEKEEPER = registerItem("staffs/gatekeeper", new ModStaffItem(ToolMaterials.IRON, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The staff of office of the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("warden of the underworld.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MALIGENII = registerItem("staffs/maligenii", new ModStaffItem(ToolMaterials.IRON, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The preferred implement of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("archmages.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GODSLEG = registerItem("staffs/godsleg", new ModStaffItem(ToolMaterials.DIAMOND, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Carved out of the femur of a").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("forgotten god.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerStaffItems() {}
}