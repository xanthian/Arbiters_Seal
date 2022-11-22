package net.xanthian.arbiters_seal.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.tag.BiomeTags;
import net.minecraft.world.Heightmap;
import net.xanthian.arbiters_seal.entity.ModMobEntities;

public class ModEntitySpawn {

    public static void generateEntitySpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheNether(), SpawnGroup.MONSTER,
                ModMobEntities.AEOTH, 10, 1, 3);
        SpawnRestriction.register(ModMobEntities.AEOTH, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);


        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_FOREST), SpawnGroup.MONSTER,
                ModMobEntities.ZOTZIT, 75, 1, 5);
        SpawnRestriction.register(ModMobEntities.ZOTZIT, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
    }
}
