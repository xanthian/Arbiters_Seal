package net.xanthian.arbiters_seal.entity.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.xanthian.arbiters_seal.Init;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.items.NormalItems;
import net.xanthian.arbiters_seal.items.RareItems;
import net.xanthian.arbiters_seal.items.gadgets.Gadgets;
import net.xanthian.arbiters_seal.items.tools.Guns;

public class ModVillagers {

    public static final PointOfInterestType GUNSTATION = registerPOI("gunstation", ModBlocks.GUNSTATION);
    public static final VillagerProfession GUNSMITH = registerProfession("gunsmith",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Init.MOD_ID, "gunstation")));

    public static final PointOfInterestType GADGET_STATION = registerPOI("gadget_station", ModBlocks.GADGET_STATION);
    public static final VillagerProfession GADGETEER = registerProfession("gadgeteer",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Init.MOD_ID, "gadget_station")));

    public static void registerTrades() {

        // Gunsmith
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 21),
                            new ItemStack(Guns.FLINTLOCK, 1),
                            6, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUNPOWDER, 10),
                            new ItemStack(Items.EMERALD, 1),
                            6, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUNPOWDER, 32),
                            new ItemStack(NormalItems.BULLETS, 32),
                            6, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Guns.BOOMSTICK, 1),
                            3, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Guns.FLINTLOCK, 1),
                            new ItemStack(Items.EMERALD, 2),
                            5, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(NormalItems.SILVER_INGOT, 3),
                            5, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Guns.HAND_CANNON, 1),
                            3, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Guns.BOOMSTICK, 1),
                            new ItemStack(Items.EMERALD, 3),
                            3, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(NormalItems.BULLETS, 32),
                            new ItemStack(Items.EMERALD, 1),
                            3, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(NormalItems.TEORITE_INGOT, 3),
                            5, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(Guns.LONG_BARREL, 1),
                            3, 15, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(NormalItems.BULLETS, 64),
                            3, 15, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GUNSMITH, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Guns.LONG_BARREL, 1),
                            new ItemStack(Items.EMERALD, 2),
                            3, 15, 0.02f
                    )));
                });


        // Gadgeteer
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Gadgets.SPRINGGER, 1),
                            5, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(RareItems.MYCOLEATHER, 1),
                            12, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(Gadgets.ABSORBER_PLUS, 1),
                            2, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(RareItems.ALOE_LEAF, 20),
                            new ItemStack(RareItems.DORMANT_CRYSTAL, 1),
                            10, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Gadgets.SPRINGGER, 1),
                            new ItemStack(RareItems.AMMONIAC_GUM, 1),
                            10, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Gadgets.IMPALOTRON, 1),
                            2, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Gadgets.ELECTROCONSTRICTOR, 1),
                            2, 15, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(GADGETEER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Gadgets.SPRINGGER, 1),
                            new ItemStack(Gadgets.HEALBOT_3000, 1),
                            2, 15, 0.02f
                    )));
                });
    }


    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Init.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Init.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Init.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
    }
}
