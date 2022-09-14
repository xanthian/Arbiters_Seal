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

public class Swords {

    public static final Item SHORTSWORD = registerItem("swords/shortsword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A soldiers truest friend.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item LONGSWORD = registerItem("swords/longsword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blade for a valorous knight.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SILVER_SWORD = registerItem("swords/silver_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A ceremonial sword blessed by a venerable priest.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TOOTHED_SWORD = registerItem("swords/toothed_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A gruesome weapon capable of inflicting horrific wounds.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item TEORITE_SWORD = registerItem("swords/teorite_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Forged from the purest teorite, shard enough to slice spells apart.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ICEBRAND = registerItem("swords/icebrand", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A blade quenched in the coldest currents of the ocean.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item FLAMEBRAND = registerItem("swords/flamebrand", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A sword forged in the heat of a volcano.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item STONEBRAND = registerItem("swords/stonebrand", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A sword honed on the hardest of diamonds.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item BOLTBRAND = registerItem("swords/boltbrand", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A lightning bolt hammered in to the shape of a sword.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item ENHANCER = registerItem("swords/enhancer", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("An oversized athame to help focus magical powers.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EBONY_SWORD = registerItem("swords/ebony_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A sword as black as night to tame the darkness.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item DENDRITE_SWORD = registerItem("swords/dendrite_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A crystaline blade that dissipates holy magic.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item SINGING_SWORD = registerItem("swords/singing_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("Its eerie whistling keeps its user awake at night.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }});

    public static final Item EXCALIBUR = registerItem("swords/excalibur", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The holiest of all swords will heal all wounds over time.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
    });

    public static final Item SOUL_EATER = registerItem("swords/soul_eater", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("A diabolical weapon that feeds its wielders lust for power.").formatted(Formatting.ITALIC, Formatting.GRAY));
    }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
    });

    public static final Item GUARDIAN_SWORD = registerItem("swords/guardian_sword", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A weapon covered in protective runes.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }
    });

    public static final Item ETERNIAS = registerItem("swords/eternias", new ModSwordItem(ToolMaterials.NETHERITE, 3, 3F){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("The strongest, deadliest of all swords.").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerSwordItems() {}
}