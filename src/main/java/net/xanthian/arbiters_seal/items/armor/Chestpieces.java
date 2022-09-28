package net.xanthian.arbiters_seal.items.armor;

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
import net.xanthian.arbiters_seal.material.ModArmorMaterial;

import java.util.List;

public class Chestpieces {

    // CLOTH
    public static final Item LINEN_ROBE = registerItem("chestpieces/linen_robe", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item COTTON_ROBE = registerItem("chestpieces/cotton_robe", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item SILK_ROBE = registerItem("chestpieces/silk_robe", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item FLOWING_ROBE = registerItem("chestpieces/flowing_robe", new ModChestItem(ArmorMaterials.IRON));
    public static final Item MOLTEN_ROBE = registerItem("chestpieces/molten_robe", new ModChestItem(ArmorMaterials.IRON));
    public static final Item SAND_ROBE = registerItem("chestpieces/sand_robe", new ModChestItem(ArmorMaterials.IRON));
    public static final Item SPARK_ROBE = registerItem("chestpieces/spark_robe", new ModChestItem(ArmorMaterials.IRON));
    public static final Item MONK_ROBE = registerItem("chestpieces/monk_robe", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item WHITE_ROBE = registerItem("chestpieces/white_robe", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item BLACK_ROBE = registerItem("chestpieces/black_robe", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item VELVET_ROBE = registerItem("chestpieces/velvet_robe", new ModChestItem(ArmorMaterials.IRON));
    public static final Item DEVOUT_ROBE = registerItem("chestpieces/devout_robe", new ModChestItem(ArmorMaterials.DIAMOND));
    public static final Item DARKSILK_ROBE = registerItem("chestpieces/darksilk_robe", new ModChestItem(ArmorMaterials.DIAMOND){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item SCHOLAR_ROBE = registerItem("chestpieces/scholar_robe", new ModChestItem(ArmorMaterials.DIAMOND));
    public static final Item EMBROIDERED_ROBE = registerItem("chestpieces/embroidered_robe", new ModChestItem(ArmorMaterials.NETHERITE));
    public static final Item MASTER_ROBE = registerItem("chestpieces/master_robe", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    // LIGHT
    public static final Item TRAVELER_GARB = registerItem("chestpieces/traveler_garb", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item LEATHER_ARMOR = registerItem("chestpieces/leather_armor", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item CHAIN_MAIL = registerItem("chestpieces/chain_mail", new ModChestItem(ArmorMaterials.IRON));
    public static final Item BRIGANDINE = registerItem("chestpieces/brigandine", new ModChestItem(ArmorMaterials.LEATHER));
    public static final Item TEORITE_VEST = registerItem("chestpieces/teorite_vest", new ModChestItem(ModArmorMaterial.TEORITE));
    public static final Item JUDOGI = registerItem("chestpieces/judogi", new ModChestItem(ArmorMaterials.IRON));
    public static final Item DESERT_GARB = registerItem("chestpieces/desert_garb", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item NINJA_GARB = registerItem("chestpieces/ninja_garb", new ModChestItem(ArmorMaterials.IRON));
    public static final Item CHITIN_SUIT = registerItem("chestpieces/chitin_suit", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item GOLDEN_GARB = registerItem("chestpieces/golden_garb", new ModChestItem(ArmorMaterials.GOLD));
    public static final Item ARBITER_GARB = registerItem("chestpieces/arbiter_garb", new ModChestItem(ArmorMaterials.DIAMOND){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item LORICA_SPECULO = registerItem("chestpieces/lorica_speculo", new ModChestItem(ArmorMaterials.NETHERITE));
    public static final Item LORICA_MUSCULATA = registerItem("chestpieces/lorica_musculata", new ModChestItem(ArmorMaterials.NETHERITE));
    public static final Item LORICA_MENTIS = registerItem("chestpieces/lorica_mentis", new ModChestItem(ArmorMaterials.NETHERITE));
    public static final Item NOCTIS_GARB = registerItem("chestpieces/noctis_garb", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item SHINING_MAIL = registerItem("chestpieces/shining_mail", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    // HEAVY
    public static final Item BRONZE_ARMOR = registerItem("chestpieces/bronze_armor", new ModChestItem(ModArmorMaterial.BRONZE));
    public static final Item STEEL_ARMOR = registerItem("chestpieces/steel_armor", new ModChestItem(ModArmorMaterial.STEEL));
    public static final Item SILVER_ARMOR = registerItem("chestpieces/silver_armor", new ModChestItem(ModArmorMaterial.SILVER));
    public static final Item GOLD_ARMOR = registerItem("chestpieces/gold_armor", new ModChestItem(ArmorMaterials.GOLD));
    public static final Item TEORITE_ARMOR = registerItem("chestpieces/teorite_armor", new ModChestItem(ModArmorMaterial.TEORITE));
    public static final Item COLD_ARMOR = registerItem("chestpieces/cold_armor", new ModChestItem(ArmorMaterials.IRON){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item ANCIENT_ARMOR = registerItem("chestpieces/ancient_armor", new ModChestItem(ArmorMaterials.IRON));
    public static final Item DRAGONSCALE_MAIL = registerItem("chestpieces/dragonscale_mail", new ModChestItem(ArmorMaterials.DIAMOND){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item DENDRITE_ARMOR = registerItem("chestpieces/dendrite_armor", new ModChestItem(ModArmorMaterial.DENDRITE));
    public static final Item ARBITER_ARMOR = registerItem("chestpieces/arbiter_armor", new ModChestItem(ArmorMaterials.DIAMOND){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item ROYAL_ARMOR = registerItem("chestpieces/royal_armor", new ModChestItem(ArmorMaterials.NETHERITE));
    public static final Item VALIANT_ARMOR = registerItem("chestpieces/valiant_armor", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item SOUL_ARMOR = registerItem("chestpieces/soul_armor", new ModChestItem(ArmorMaterials.NETHERITE){
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {

        }
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerChestpieceItems() {}
}