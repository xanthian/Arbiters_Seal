package net.xanthian.arbiters_seal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.xanthian.arbiters_seal.items.Bows;

import static net.xanthian.arbiters_seal.renderer.VariantItemsClientRenderer.registerBowPredicates;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Bows
        registerBowPredicates(Bows.COMPOSITE_BOW);
        registerBowPredicates(Bows.LONGBOW);
        registerBowPredicates(Bows.MACH_BOW);
        registerBowPredicates(Bows.SHORTBOW);
        registerBowPredicates(Bows.SILVER_BOW);
        registerBowPredicates(Bows.TEORITE_BOW);
        registerBowPredicates(Bows.TRUE_FLIGHT);
        registerBowPredicates(Bows.WARBOW);
        registerBowPredicates(Bows.YOICHI_BOW);
        registerBowPredicates(Bows.DOMINANCE);

                    // Crossbows
    }
}