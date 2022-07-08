package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModFeaturesOld {
/*
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TestMod.MODID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TestMod.MODID);

    public static final RegistryObject<ConfiguredFeature<OreConfiguration, ?>> ORE_RED_EMERALD_FEATURE = CONFIGURED_FEATURES.register("ore_red_emerald", () -> new ConfiguredFeature<>(Feature.ORE,
            new OreConfiguration(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RED_EMERALD_ORE.get().defaultBlockState(), 3)));

    public static final RegistryObject<PlacedFeature> ORE_RED_EMERALD = PLACED_FEATURES.register("ore_red_emerald", () ->
            new PlacedFeature(Holder.direct(ORE_RED_EMERALD_FEATURE.get()),
                    commonOrePlacement(100, HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(32)))));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_);
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

 */

}
