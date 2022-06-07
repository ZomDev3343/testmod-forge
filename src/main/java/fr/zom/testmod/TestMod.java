package fr.zom.testmod;

import fr.zom.testmod.config.TestModConfig;
import fr.zom.testmod.init.ModBlocks;
import fr.zom.testmod.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TestMod.MODID)
public class TestMod {

    public static final String MODID = "testmod";

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("testmod.mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_EMERALD.get());
        }
    };

    public static final Logger LOGGER = LogManager.getLogger(MODID.toUpperCase());

    public TestMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext modLoadingContext = ModLoadingContext.get();


        registerConfigs(modLoadingContext);

        addRegistries(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);



    }

    public void setup(FMLCommonSetupEvent e) {
        if(!TestModConfig.COMMON.RED_EMERALD_ENABLED.get())
        {
            LOGGER.info("Red emerald disabled !");
        }
    }

    public void clientSetup(FMLClientSetupEvent e) {

    }

    private void addRegistries(IEventBus bus) {
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }

    private void registerConfigs(ModLoadingContext ctx) {
        String configFolder = MODID + "/";

        ctx.registerConfig(ModConfig.Type.CLIENT, TestModConfig.clientSpec, configFolder + "client-config.toml");
        ctx.registerConfig(ModConfig.Type.SERVER, TestModConfig.serverSpec, configFolder + "server-config.toml");
        ctx.registerConfig(ModConfig.Type.COMMON, TestModConfig.commonSpec, configFolder + "common-config.toml");
    }
}
