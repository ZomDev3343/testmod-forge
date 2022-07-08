package fr.zom.testmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers{

    public static final ForgeTier BLACK_TIER = new ForgeTier(2, 500, 6.5f, 2.5f, 15, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BLACK_EMERALD.get()));

}
