package net.xanthian.arbiters_seal.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {

            ModTreeGeneration.generateTrees();
            ModOreGeneration.generateOres();
            ModGeodeGeneration.generateGeodes();
            ModFlowerGeneration.generateFlowers();
    }
}