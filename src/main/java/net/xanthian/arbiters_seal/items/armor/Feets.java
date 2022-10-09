package net.xanthian.arbiters_seal.items.armor;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Feets {

    public static final Item TOAD_BOOTS = registerItem("feets/toad_boots", new ModFeetItem(ArmorMaterials.DIAMOND));
    public static final Item RUNNING_TREADS = registerItem("feets/running_treads", new ModFeetItem(ArmorMaterials.IRON));
    public static final Item IMPALA_BOOTS = registerItem("feets/impala_boots", new ModFeetItem(ArmorMaterials.NETHERITE));
    public static final Item WAYFARER_TREADS = registerItem("feets/wayfarer_treads", new ModFeetItem(ArmorMaterials.IRON));
    public static final Item JET_BOOTS = registerItem("feets/jet_boots", new ModFeetItem(ArmorMaterials.NETHERITE){
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item GREMLIN_TREADS = registerItem("feets/gremlin_treads", new ModFeetItem(ArmorMaterials.DIAMOND));
    public static final Item PLAINWALKERS = registerItem("feets/plainwalkers", new ModFeetItem(ArmorMaterials.NETHERITE){
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;
        }});

    public static final Item HOVER_BOOTS = registerItem("feets/hover_boots", new ModFeetItem(ArmorMaterials.DIAMOND));
    public static final Item RIFTWALKERS = registerItem("feets/riftwalkers", new ModFeetItem(ArmorMaterials.IRON){
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.UNCOMMON;
        }});

    public static final Item FLIPPERS = registerItem("feets/flippers", new ModFeetItem(ArmorMaterials.DIAMOND));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerFeetItems() {}
}
