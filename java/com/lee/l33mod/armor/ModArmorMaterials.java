package com.lee.l33mod.armor;

import com.lee.l33mod.L33Mod;
import com.lee.l33mod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterials implements IArmorMaterial {

    RUBY(L33Mod.MOD_ID + ":ruby", 33, new int[] { 2, 5, 6, 2}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0F, () -> { return Ingredient.fromItems(RegistryHandler.RUBY.get()); }),
    TOPAZ(L33Mod.MOD_ID + ":topaz", 33, new int[] { 2, 5, 6, 2}, 10,
         SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0F, () -> { return Ingredient.fromItems(RegistryHandler.TOPAZ.get()); }),
    SAPPHIRE(L33Mod.MOD_ID + ":sapphire", 33, new int[] { 2, 5, 6, 2}, 10,
         SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0F, () -> { return Ingredient.fromItems(RegistryHandler.SAPPHIRE.get()); }),
    EMERALD(L33Mod.MOD_ID + ":emerald", 33, new int[] { 2, 5, 6, 2}, 10,
         SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0F, () -> { return Ingredient.fromItems(RegistryHandler.EMERALD.get()); }),
    INFINIUM(L33Mod.MOD_ID + ":infinium", 66, new int[] { 4, 7, 8, 4}, 20,
         SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0F, () -> { return Ingredient.fromItems(RegistryHandler.INFINIUM.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                      SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return 0;
    }

}
