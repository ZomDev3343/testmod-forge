package fr.zom.testmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> BLACK_EMERALD = ITEMS.register("black_emerald", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_EMERALD = ITEMS.register("red_emerald", () -> new Item(new Item.Properties()));
}
