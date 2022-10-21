package net.xanthian.arbiters_seal.items.trinkets;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.items.trinkets.earrings.AmethystEarring;
import net.xanthian.arbiters_seal.items.trinkets.earrings.RubyEarring;
import net.xanthian.arbiters_seal.items.trinkets.earrings.SapphireEarring;
import net.xanthian.arbiters_seal.items.trinkets.lockets.*;
import net.xanthian.arbiters_seal.items.trinkets.other.Glasses;
import net.xanthian.arbiters_seal.items.trinkets.rings.*;

public class Trinkets {

    // RING
    public static final Item PURE_BAND = registerItem("trinkets/pure_band",
            new PureBand());
    public static final Item SHINING_BAND = registerItem("trinkets/shining_band",
            new ShiningBand());
    public static final Item CLARITY_BAND = registerItem("trinkets/clarity_band",
            new ClarityBand());
    public static final Item OATH_BAND = registerItem("trinkets/oath_band",
            new OathBand());
    public static final Item PHOENIX_BAND = registerItem("trinkets/phoenix_band",
            new PhoenixBand());
    public static final Item VIGIL_BAND = registerItem("trinkets/vigil_band",
            new VigilBand());

    // EARRING
    public static final Item SAPPHIRE_EARRING = registerItem("trinkets/sapphire_earring",
            new SapphireEarring());
    public static final Item RUBY_EARRING = registerItem("trinkets/ruby_earring",
            new RubyEarring());
    public static final Item AMETHYST_EARRING = registerItem("trinkets/amethyst_earring",
            new AmethystEarring());

    // NECKLACE
    public static final Item ENERGY_LOCKET = registerItem("trinkets/energy_locket",
            new EnergyLocket());
    public static final Item BATTLE_LOCKET = registerItem("trinkets/battle_locket",
            new BattleLocket());
    public static final Item ZEPHYR_LOCKET = registerItem("trinkets/zephyr_locket",
            new ZephyrLocket());
    public static final Item SHIELD_LOCKET = registerItem("trinkets/shield_locket",
            new ShieldLocket());
    public static final Item MIRROR_LOCKET = registerItem("trinkets/mirror_locket",
            new MirrorLocket());
    public static final Item ANCIENT_LOCKET = registerItem("trinkets/ancient_locket",
            new AncientLocket());

    // OTHER
    public static final Item GLASSES = registerItem("trinkets/glasses",
            new Glasses());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerTrinketItems() {}
}