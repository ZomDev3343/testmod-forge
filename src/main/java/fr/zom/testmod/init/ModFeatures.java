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

public class ModFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TestMod.MODID);

    public static final RegistryObject<ConfiguredFeature<OreConfiguration, Feature<OreConfiguration>>> ORE_RED_EMERALD_FEATURE = FEATURES.register("ore_red_emerald_feature", () -> new ConfiguredFeature<>(Feature.ORE,
            new OreConfiguration(List.of(OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RED_EMERALD_ORE.get().defaultBlockState())), 7)));

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TestMod.MODID);

    public static final RegistryObject<PlacedFeature> ORE_RED_EMERALD = PLACED_FEATURES.register("ore_red_emerald",
            () -> new PlacedFeature(Holder.direct(ORE_RED_EMERALD_FEATURE.get()),
                    List.of(InSquarePlacement.spread(), BiomeFilter.biome(), CountPlacement.of(55),
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(50)))));

}
