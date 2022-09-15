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

    // CLOTH
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

    public static final Item SAGE_HAT = registerItem("helmets/sage_hat", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A tall hat worn by religious").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("types.").formatted(Formatting.ITALIC, Formatting.GRAY));
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
        }});

    public static final Item WITCH_CROWN = registerItem("helmets/witch_crown", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A hate woven from raw").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("moonlight, enhances all martial").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("abilities.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });


    // LIGHT
    public static final Item FUR_CAP = registerItem("helmets/fur_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thick racoon fur cap, very").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("warm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FEATHERED_CAP = registerItem("helmets/feathered_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A dyed leather hat with an").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("eagles feather.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item LEATHER_HELMET = registerItem("helmets/leather_helmet", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Heavy boiled leather helmet,").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("common amongst mercenaries.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GREEN_BERET = registerItem("helmets/green_beret", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The dress hat of an elite").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("military unit.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item POSEURS_CAP = registerItem("helmets/poseurs_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Big flashy headgear worn by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("charlatans and dandies.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item RED_BERET = registerItem("helmets/red_beret", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A beret dyed red to hide head").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("wounds.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STUDDED_HELM = registerItem("helmets/studded_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A leather helmet reinforced").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("with metal studs and bands.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CHAIN_COIF = registerItem("helmets/chain_coif", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A chain mail hood that protects").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("the entire head.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SPIDERSILK_CAP = registerItem("helmets/spidersilk_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A veil woven out of spider silk.").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("Incredibly light and resistant.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BLACK_COWL = registerItem("helmets/black_cowl", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A black silk mask favored by").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("mystical assassins.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ARBITER_CAP = registerItem("helmets/arbiter_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The hat of a highly skilled").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("travelling warrior.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item NINJA_COWL = registerItem("helmets/ninja_cowl", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A cowl allowed to only the").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("most vicious killers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FLASH_CAP = registerItem("helmets/flash_cap", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A hat that grants incredible").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("speed.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item CAP_OF_AGES = registerItem("helmets/cap_of_ages", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A turban that makes its wearer").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("nigh impossible to kill.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});


    // HEAVY
    public static final Item BRONZE_HELM = registerItem("helmets/bronze_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An old horseman's helmet").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STEEL_HELM = registerItem("helmets/steel_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Standard-issue military").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("headgear.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_HELM = registerItem("helmets/silver_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A silver helmet with a crest of").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("red horsehair.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item GOLD_HELM = registerItem("helmets/gold_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A flashy helmet to help officers").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("be seen.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_HELM = registerItem("helmets/teorite_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thick racoon fur cap, very").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("warm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MALCUBUS_HELM = registerItem("helmets/malcubus_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A thick racoon fur cap, very").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("warm.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item MORION = registerItem("helmets/morion", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An open helmet heavily").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("reinforced to protect against").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("head blows.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DENDRITE_HELM = registerItem("helmets/dendrite_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An armet carved out of green").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("crystal.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ARBITER_HELM = registerItem("helmets/arbiter_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An armet carved out of green").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("crystal.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ROYAL_HELM = registerItem("helmets/royal_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An ornate helm decorated with").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("gold and gemstones.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item VALIANT_HELM = registerItem("helmets/valiant_helm", new ModHelmetItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A helmet engraved with scenes").formatted(Formatting.ITALIC, Formatting.GRAY));
            tooltip.add(Text.literal("of heroism.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerHelmetItems() {}
}