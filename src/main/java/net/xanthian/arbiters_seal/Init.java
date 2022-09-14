package net.xanthian.arbiters_seal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.arbiters_seal.enchantments.ModEnchantments;
import net.xanthian.arbiters_seal.items.Bows;
import net.xanthian.arbiters_seal.items.Swords;

public class Init implements ModInitializer {

    public static final String MOD_ID = "arbiters_seal";
    public static final ItemGroup ARBITERS_SEAL = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "arbiters_seal"),
            () -> new ItemStack(Swords.EXCALIBUR));

    @Override
    public void onInitialize() {

        Swords.registerSwordItems();
        Bows.registerBowItems();
        ModEnchantments.registerModEnchantments();

    }
}
