package net.xanthian.arbiters_seal.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.arbiters_seal.blocks.ModBlocks;
import net.xanthian.arbiters_seal.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void registerPOI() {
        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        // Fisherman - Barrel
        RegistryEntry<PointOfInterestType> fishermanEntry = Registry.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FISHERMAN).get();
        PointOfInterestType fishermanPoiType = Registry.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FISHERMAN);
        List<BlockState> fishermanBlockStates = new ArrayList<BlockState>(fishermanPoiType.blockStates);
            ImmutableList<BlockState> barrelblockStates =
                    ModBlocks.EBONY_BARREL.getStateManager().getStates();
            for (BlockState blockState : barrelblockStates) {
                poiStatesToType.putIfAbsent(blockState, fishermanEntry);
            }
            fishermanBlockStates.addAll(barrelblockStates);
        fishermanPoiType.blockStates = ImmutableSet.copyOf(fishermanBlockStates);

        // Farmer - Composter
        RegistryEntry<PointOfInterestType> farmerEntry = Registry.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FARMER).get();
        PointOfInterestType farmerPoiType = Registry.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FARMER);
        List<BlockState> farmerBlockStates = new ArrayList<BlockState>(farmerPoiType.blockStates);
        ImmutableList<BlockState> composterblockStates =
                ModBlocks.EBONY_COMPOSTER.getStateManager().getStates();
        for (BlockState blockState : composterblockStates) {
            poiStatesToType.putIfAbsent(blockState, farmerEntry);
        }
        farmerBlockStates.addAll(composterblockStates);
        farmerPoiType.blockStates = ImmutableSet.copyOf(farmerBlockStates);
    }
}