package net.xanthian.arbiters_seal.config;

import com.mojang.datafixers.util.Pair;
import net.xanthian.arbiters_seal.Init;

import java.util.ArrayList;
import java.util.List;

public class ArbitersSealConfig  implements SimpleConfig.DefaultConfig {

    private String configContents =
            """
                   ##########################################################################################
                   # Disable Ore Gen
                   # Disable Tree Gen
                   # Remove Ingots
                   # Remove Planks
                   # (>'.')> ~ Enter true to enable or false to disable ~ <('.'<)
                   ##########################################################################################
                   """;

    public List<Pair> getConfigsList() {
        return configsList;
    }

    private final List<Pair> configsList = new ArrayList<>();

    public void addKeyValuePair(Pair<String, ?> keyValuePair) {
        configsList.add(keyValuePair);
        configContents +="\n"+ keyValuePair.getFirst() + "=" + keyValuePair.getSecond() + "\n";
    }
        @Override
        public String get(String namespace) {
            return configContents;
        }
        public static SimpleConfig CONFIG;
        private static ArbitersSealConfig configs;

        public static boolean ore_gen;
        public static boolean tree_gen;
        public static boolean ingots;
        public static boolean planks;


        public static void registerConfigs() {
            configs = new ArbitersSealConfig();
            createConfigs();

            CONFIG = SimpleConfig.of(Init.MOD_ID + "_config").provider(configs).request();

            assignConfigs();
        }

        private static void createConfigs() {
            configs.addKeyValuePair(new Pair<>("ore_gen", true));
            configs.addKeyValuePair(new Pair<>("tree_gen", true));
            configs.addKeyValuePair(new Pair<>("ingots", true));
            configs.addKeyValuePair(new Pair<>("planks", true));

        }

        private static void assignConfigs() {
            ore_gen = CONFIG.getOrDefault("ore_gen", true);
            tree_gen = CONFIG.getOrDefault("tree_gen", true);
            ingots = CONFIG.getOrDefault("ingots", true);
            planks = CONFIG.getOrDefault("planks", true);

        }
}