package fr.zom.testmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MODID)
public class TestMod {

    public static final String MODID = "testmod";

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("testmod.mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_EMERALD.get());
        }
    };

    public TestMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        addRegistries(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

    }

    public void setup(FMLCommonSetupEvent e) {

    }

    public void clientSetup(FMLClientSetupEvent e) {

    }

    private void addRegistries(IEventBus bus)
    {
        ModItems.ITEMS.register(bus);
    }
}
