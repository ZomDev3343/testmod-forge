package fr.zom.testmod.init;

import fr.zom.testmod.TestMod;
import fr.zom.testmod.items.ModSpecialArmor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> BLACK_EMERALD = ITEMS.register("black_emerald", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_EMERALD = ITEMS.register("red_emerald", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_SWORD = ITEMS.register("black_sword", () -> new SwordItem(ModTiers.BLACK_TIER, 3, -2.4f, new Item.Properties().tab(TestMod.MOD_TAB))
    {
        @Override
        public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

            if(!pAttacker.getLevel().isClientSide())
            {
                pTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0));
            }

            return true;
        }
    });
    public static final RegistryObject<Item> BLACK_PICKAXE = ITEMS.register("black_pickaxe", () -> new PickaxeItem(ModTiers.BLACK_TIER, 2, -2.4f, new Item.Properties().tab(TestMod.MOD_TAB)));
    public static final RegistryObject<Item> BLACK_SHOVEL = ITEMS.register("black_shovel", () -> new ShovelItem(ModTiers.BLACK_TIER, 2, -2.4f, new Item.Properties().tab(TestMod.MOD_TAB)));
    public static final RegistryObject<Item> BLACK_AXE = ITEMS.register("black_axe", () -> new AxeItem(ModTiers.BLACK_TIER, 4, -2.8f, new Item.Properties().tab(TestMod.MOD_TAB)));
    public static final RegistryObject<Item> BLACK_HOE = ITEMS.register("black_hoe", () -> new HoeItem(ModTiers.BLACK_TIER, 1, -2.1f, new Item.Properties().tab(TestMod.MOD_TAB)));

    public static final RegistryObject<Item> BLACK_HELMET = ITEMS.register("black_helmet", () -> new ModSpecialArmor(EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CHESTPLATE = ITEMS.register("black_chestplate", () -> new ModSpecialArmor(EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_LEGGINGS = ITEMS.register("black_leggings", () -> new ModSpecialArmor(EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BOOTS = ITEMS.register("black_boots", () -> new ModSpecialArmor(EquipmentSlot.FEET, new Item.Properties()));

}
