package com.lee.l33mod.world;

import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class FeatureGen {

    private ConfiguredFeature<*, *> ORE_RUBY;

    private final int veinSize = 2;
    private final int maxHeight = 30;
    private final int minHeight = 23;
    private final int veinsPerChunk = 10;

    public static void registerConfiguredFeatures(event: FMLCommonSetupEvent) {
        Registry<ConfiguredFeature<*, *>>Object registry = WorldGenRegistries.CONFIGURED_FEATURE;
        ORE_RUBY = Feature.NO_SURFACE_ORE.withConfiguration(
                OreFeatureConfig(
                        OreFeatureConfig.FillerBlockType.field_241883_b,
                        BlockRegistry.RUBY_ORE_BLOCK.getDefaultState(),
                        veinSize))
                .withPlacement(Placement.field_242907_l.configure(TopSolidRangeConfig(minHeight, 0, maxHeight))).func_242728_a().func_242731_b(veinsPerChunk);

        Registry.register(registry, ResourceLocation(RubyMod.MOD_ID, "ore_ruby"), ORE_RUBY);
    }

    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        if (event.getCategory().equals(Biome.Category.NETHER)) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, ORE_RUBY);
        }
    }

}
