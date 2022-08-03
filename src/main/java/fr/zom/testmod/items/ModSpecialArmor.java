package fr.zom.testmod.items;

import fr.zom.testmod.init.ModArmorMaterial;
import net.minecraft.core.NonNullList;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModSpecialArmor extends ArmorItem
{
    public ModSpecialArmor(EquipmentSlot slot, Properties properties) {
        super(ModArmorMaterial.BLACK_ARMOR, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide){
            NonNullList<ItemStack> armor = player.getInventory().armor;
            if(armor.stream().allMatch(it -> it.getItem() instanceof ModSpecialArmor))
            {
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0));
            }
        }
    }
}
