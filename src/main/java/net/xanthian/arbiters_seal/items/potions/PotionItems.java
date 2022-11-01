package net.xanthian.arbiters_seal.items.potions;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class PotionItems {

    public static final Item FULL_POTION = registerItem("potions/full_potion",
            new FullPotion());

    public static final Item REMEDY = registerItem("potions/remedy",
            new RemedyPotion());

    //public static final Item NOXIOUS_BOMB = registerItem("potions/noxious_bomb",

    //public static final Item CORROSIVE_BOMB = registerItem("potions/corrosive_bomb",

    public static final Item PHOENIX_ASHES = registerItem("potions/phoenix_ashes",
            new RebirthPotion());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerPotionItems() {}
}