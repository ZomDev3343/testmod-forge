package fr.zom.testmod.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterial implements ArmorMaterial {
    BLACK_ARMOR(230, new int[]{2, 5, 6, 2}, 10, SoundEvents.ARMOR_EQUIP_IRON, null, "black_armor", 0f, 0f);

    private int durability;
    private int[] defenseSlots;
    private int enchantmentValue;
    private SoundEvent equipSound;
    private Ingredient repairMaterial;
    private String name;
    private float toughness;
    private float knockbackResistance;

    ModArmorMaterial(int durability, int[] defenseSlots, int enchantmentValue, SoundEvent equipSound, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durability = durability;
        this.defenseSlots = defenseSlots;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return defenseSlots[p_40411_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
