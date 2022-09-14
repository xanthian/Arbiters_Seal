package net.xanthian.arbiters_seal.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorMaterials;
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

public class Helmets {

    public static final Item CIRCLET = registerItem("helmets/circlet", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thin bronze hair ornament.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item PHYRGIAN_CAP = registerItem("helmets/phrygian_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A felt hat worn by rebels.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_CIRCLET = registerItem("helmets/silver_circlet", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A silver tiara, delicate but").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("strong against magic.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BATTLEMAGE_HAT = registerItem("helmets/battlemage_hat", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A colorful hat to boost").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("confidence.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_CIRCLET = registerItem("helmets/teorite_circlet", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gorgeous teorite coronet").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("forged by an artist.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WIZARD_CONE = registerItem("helmets/wizard_cone", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Classic wizard headgear.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MITER = registerItem("helmets/miter", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("This hat ensures delivery of the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("longest sermons.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item WHITE_HAT = registerItem("helmets/white_hat", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A bleached silk hat with").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("unmatched magical protection.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BLACK_HAT = registerItem("helmets/black_hat", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A hat of black velvet, the mark").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of an archmage.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ROYAL_CROWN = registerItem("helmets/royal_crown", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An impressive crown of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("many metals.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
            @Override
            public Rarity getRarity(ItemStack stack) {
                return Rarity.UNCOMMON;
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerHelmetItems() {}
}