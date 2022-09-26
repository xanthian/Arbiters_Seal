package net.xanthian.arbiters_seal.items.trinkets;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;

public class Trinkets {

    // RING
    public static final Item PURE_BAND = registerItem("trinkets/pure_band", new ModTrinketItem());
    public static final Item SHINING_BAND = registerItem("trinkets/shining_band", new ModTrinketItem());
    public static final Item CLARITY_BAND = registerItem("trinkets/clarity_band", new ModTrinketItem());
    public static final Item OATH_BAND = registerItem("trinkets/oath_band", new ModTrinketItem());
    public static final Item PHOENIX_BAND = registerItem("trinkets/phoenix_band", new ModTrinketItem());
    public static final Item VIGIL_BAND = registerItem("trinkets/vigil_band", new ModTrinketItem());

    // EARRING
    public static final Item SAPPHIRE_EARRING = registerItem("trinkets/sapphire_earring", new ModTrinketItem());
    public static final Item RUBY_EARRING = registerItem("trinkets/ruby_earring", new ModTrinketItem());
    public static final Item AMETHYST_EARRING = registerItem("trinkets/amethyst_earring", new ModTrinketItem());

    // NECKLACE
    public static final Item ENERGY_LOCKET = registerItem("trinkets/energy_locket", new ModTrinketItem());
    public static final Item BATTLE_LOCKET = registerItem("trinkets/battle_locket", new ModTrinketItem());
    public static final Item ZEPHYR_LOCKET = registerItem("trinkets/zephyr_locket", new ModTrinketItem());
    public static final Item SHIELD_LOCKET = registerItem("trinkets/shield_locket", new ModTrinketItem());
    public static final Item MIRROR_LOCKET = registerItem("trinkets/mirror_locket", new ModTrinketItem());
    public static final Item GLASSES = registerItem("trinkets/glasses", new ModTrinketItem());
    public static final Item ANCIENT_LOCKET = registerItem("trinkets/ancient_locket", new ModTrinketItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerTrinketItems() {}
}