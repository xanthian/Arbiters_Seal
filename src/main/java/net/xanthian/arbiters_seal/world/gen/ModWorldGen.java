package net.xanthian.arbiters_seal.world.gen;

import net.xanthian.arbiters_seal.config.ArbitersSealConfig;

public class ModWorldGen {
    public static void generateModWorldGen() {

        if (ArbitersSealConfig.tree_gen == true) {
            ModTreeGeneration.generateTrees();
        }
        if (ArbitersSealConfig.ore_gen == true) {
            ModOreGeneration.generateOres();
        }
    }
}