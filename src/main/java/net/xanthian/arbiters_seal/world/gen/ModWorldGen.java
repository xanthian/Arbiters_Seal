package net.xanthian.arbiters_seal.world.gen;

public class ModWorldGen {
    public static void registerWorldGen() {

            ModTreeGeneration.generateTrees();
            ModOreGeneration.generateOres();
            ModGeodeGeneration.generateGeodes();
            ModFlowerGeneration.generateFlowers();
            ModEntitySpawn.generateEntitySpawns();
    }
}