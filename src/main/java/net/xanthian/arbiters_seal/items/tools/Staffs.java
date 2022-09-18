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

    public static final Item PLOW = registerItem("staffs/plow", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A peasant's tool, scorned by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("by real warriors.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STAFF = registerItem("staffs/staff", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A staff built for battle.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_STAFF = registerItem("staffs/silver_staff", new ModStaffItem(ModToolMaterial.SILVER, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A silver-bladed staff to hack").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the undead apart.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CRIMSON_STAFF = registerItem("staffs/crimson_staff", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Stained by the blood of its").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("victims, this staff has a dark").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("past.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_STAFF = registerItem("staffs/teorite_staff", new ModStaffItem(ModToolMaterial.TEORITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This teorite staff will sweep").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("spells away.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FAUCHARD = registerItem("staffs/fauchard", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A long-bladed polearm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ENERGY_STAFF = registerItem("staffs/energy_staff", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A magical staff bearing a blade").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of pure energy.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item KAMAITACHI = registerItem("staffs/kamaitachi", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An exotic weapon designed to").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("rip flesh from bone.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DAYS_HARVEST = registerItem("staffs/days_harvest", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This strange weapon inflicts").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("surprisingly deep cuts.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item REAPER = registerItem("staffs/reaper", new ModStaffItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This glowing staff cuts").formatted(Formatting.ITALIC, Formatting.GRAY));
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
    public static void registerStaffItems() {}
}