package net.xanthian.arbiters_seal.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Guns {

    public static final Item FLINTLOCK = registerItem("guns/flintlock", new ModGunItem());
    public static final Item BOOMSTICK = registerItem("guns/boomstick", new ModGunItem());
    public static final Item SILVER_GUN = registerItem("guns/silver_gun", new ModGunItem());
    public static final Item NAIL_GUN = registerItem("guns/nail_gun", new ModGunItem() {
    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;}});

    public static final Item HAND_CANNON = registerItem("guns/hand_cannon", new ModGunItem());
    public static final Item TEORITE_GUN = registerItem("guns/teorite_gun", new ModGunItem());
    public static final Item LONG_BARREL = registerItem("guns/long_barrel", new ModGunItem());
    public static final Item BANSHEE = registerItem("guns/banshee", new ModGunItem());
    public static final Item HELL_MUZZLE = registerItem("guns/hell_muzzle", new ModGunItem());
    public static final Item INFINITY = registerItem("guns/infinity", new ModGunItem(){
        @Override
        public Rarity getRarity(ItemStack stack) {
            return Rarity.RARE;}});

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerGunItems() {}
}
