package net.xanthian.arbiters_seal.util;

import net.minecraft.entity.Entity;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ModTradeFactory implements TradeOffers.Factory {
    private final TradeOffer offer;

    ModTradeFactory(TradeOffer offer) {
        this.offer = offer;
    }

    public TradeOffer create(Entity entity, Random random) {
        return new TradeOffer(this.offer.toNbt());
    }

    @Nullable
    @Override
    public TradeOffer create(Entity entity, net.minecraft.util.math.random.Random random) {
        return null;
    }
}