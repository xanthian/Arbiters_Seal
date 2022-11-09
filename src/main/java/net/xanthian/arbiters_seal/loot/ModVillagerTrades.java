package net.xanthian.arbiters_seal.loot;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.xanthian.arbiters_seal.items.NormalItems;
import net.xanthian.arbiters_seal.items.RareItems;
import net.xanthian.arbiters_seal.items.armor.Chestpieces;
import net.xanthian.arbiters_seal.items.armor.Helmets;
import net.xanthian.arbiters_seal.items.tools.*;

public class ModVillagerTrades {

        public static void registerTrades(){

            // Weaponsmith
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                factories.add((entity, random) -> (new TradeOffer(
                                    new ItemStack(Items.EMERALD, 7),
                                    new ItemStack(Daggers.DIRK, 1), 12, 1, 0.2F)));
            });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Spears.BOAR_SPEAR, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Maces.THUMPER, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Rapiers.FLEURET, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Mauls.SLEDGE, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Scythes.PLOW, 1), 12, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(NormalItems.SILVER_INGOT, 4),
                                new ItemStack(Items.EMERALD, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(NormalItems.TEORITE_INGOT, 4),
                                new ItemStack(Items.EMERALD, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(RareItems.COLD_IRON_INGOT, 5),
                                new ItemStack(Items.EMERALD, 10), 12, 10, 0.2F)));
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
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 64),
                                new ItemStack(Items.DIAMOND, 1),
                                new ItemStack(RareItems.GODWOOD, 1), 1, 30, 0.2F)));
                    });

            // LEATHERWORKER
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
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(Chestpieces.JUDOGI, 1), 12, 15, 0.2F)));
                    });

            // ARMORER
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(NormalItems.BRONZE_INGOT, 5),
                                new ItemStack(Items.EMERALD, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 9),
                                new ItemStack(Chestpieces.SILVER_ARMOR, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 5),
                                new ItemStack(Helmets.SILVER_HELM, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(NormalItems.SILVER_INGOT, 4),
                                new ItemStack(Items.EMERALD, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(NormalItems.TEORITE_INGOT, 4),
                                new ItemStack(Items.EMERALD, 1), 12, 10, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(RareItems.COLD_IRON_INGOT, 5),
                                new ItemStack(Items.EMERALD, 10), 12, 10, 0.2F)));
                    });

            // FARMER
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(RareItems.JAMMY_FRUIT, 3),
                                new ItemStack(Items.EMERALD, 2), 12, 30, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 15),
                                new ItemStack(RareItems.SINEWDLE_FRUIT, 1), 5, 20, 0.2F)));
                    });

            // CLERIC
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(RareItems.DISTILLED_WATER, 1), 3, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 5),
                                new ItemStack(RareItems.COBBLEWEED_POD, 1), 3, 1, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 35),
                                new ItemStack(Items.EXPERIENCE_BOTTLE, 1),
                                new ItemStack(RareItems.SNAKEBITE_OIL, 1), 5, 15, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 35),
                                new ItemStack(RareItems.SHELLAC_POWDER, 1), 5, 15, 0.2F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 20),
                                new ItemStack(Items.EXPERIENCE_BOTTLE, 1),
                                new ItemStack(RareItems.CATALYST, 1), 5, 30, 0.2F)));
                    });
        }
}
