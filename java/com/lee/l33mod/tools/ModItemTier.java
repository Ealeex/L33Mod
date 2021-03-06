package com.lee.l33mod.tools;

import com.lee.l33mod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(3, 1561, 8.0F, 4.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY.get());
    }),

    TOPAZ(3, 1561, 8.0F, 4.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.TOPAZ.get());
    }),

    SAPPHIRE(3, 1561, 8.0F, 4.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.SAPPHIRE.get());
    }),

    EMERALD(3, 1561, 8.0F, 4.0F, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.EMERALD.get());
    }),

    INFINIUM(3, 3122, 24.0F, 10.0F, 20, () -> {
        return Ingredient.fromItems(RegistryHandler.INFINIUM.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
