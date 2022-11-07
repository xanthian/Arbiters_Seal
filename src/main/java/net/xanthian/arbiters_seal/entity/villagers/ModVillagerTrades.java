package net.xanthian.arbiters_seal.entity.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.xanthian.arbiters_seal.items.armor.Chestpieces;
import net.xanthian.arbiters_seal.items.tools.*;

public class ModVillagerTrades {

        public static void registerTrades(){

            // Level 1 Trades
            // Weaponsmith
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                factories.add((entity, random) -> (new TradeOffer(
                                    new ItemStack(Items.EMERALD, 25),
                                    new ItemStack(Daggers.DIRK, 1), 12, 1, 0.2F)));
            });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Spears.BOAR_SPEAR, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Maces.THUMPER, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Rapiers.FLEURET, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Mauls.SLEDGE, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Scythes.PLOW, 1), 12, 1, 0.2F)));
                    });
            // Fletcher
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Staffs.WHITE_STAFF, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 25),
                                new ItemStack(Rods.ANCIENT_ROD, 1), 12, 1, 0.2F)));
                    });
            // Armorer
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Chestpieces.LINEN_ROBE, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Chestpieces.BRIGANDINE, 1), 12, 1, 0.2F)));
                    });
        }
}
