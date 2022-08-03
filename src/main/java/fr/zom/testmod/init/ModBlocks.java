package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static final RegistryObject<Block> RED_EMERALD_BLOCK = createBlock("red_emerald_block", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RED_EMERALD_ORE = createBlock("red_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE))
    {
        @Override
        public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
            return silkTouchLevel == 0 ? 1 + randomSource.nextInt(3) : 0;
        }
    });

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> block)
    {
        RegistryObject<Block> b = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, ()-> new BlockItem(b.get(), new Item.Properties().tab(TestMod.MOD_TAB)));
        return b;
    }
}
