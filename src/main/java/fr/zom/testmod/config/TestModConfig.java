package fr.zom.testmod.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class TestModConfig {

    public static class Client extends BaseConfig {

        public Client(ForgeConfigSpec.Builder builder) {
            super(builder);


            builder.build();
        }
    }

    public static class Server extends BaseConfig{

        public Server(ForgeConfigSpec.Builder builder) {
            super(builder);

            builder.build();
        }
    }

    public static class Common extends BaseConfig{

        public final ForgeConfigSpec.BooleanValue RED_EMERALD_ENABLED;

        public Common(ForgeConfigSpec.Builder builder) {
            super(builder);
            builder.comment("Common config").push("common");

            RED_EMERALD_ENABLED = builder
                    .comment("Test config which disabled theorically the red emerald")
                    .translation("testmod.config.red_emerald")
                    .define("red_emerald_enabled", true);

            builder.build();
        }
    }


    public static final Client CLIENT;
    public static final ForgeConfigSpec clientSpec;
    static {
        final Pair<Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Client::new);
        CLIENT = specPair.getLeft();
        clientSpec = specPair.getRight();
    }

    public static final Server SERVER;
    public static final ForgeConfigSpec serverSpec;
    static {
        final Pair<Server, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER = specPair.getLeft();
        serverSpec = specPair.getRight();
    }

    public static final Common COMMON;
    public static final ForgeConfigSpec commonSpec;
    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON = specPair.getLeft();
        commonSpec = specPair.getRight();
    }


}
