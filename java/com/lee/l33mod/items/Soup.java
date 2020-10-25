package com.lee.l33mod.items;

import com.lee.l33mod.L33Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Soup extends Item {

    public Soup(net.minecraft.potion.Effect effect) {
        super(new Properties()
                .group(L33Mod.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(2.0F)
                        .effect(() -> new EffectInstance(effect, 300, 2), 1F)
                        .setAlwaysEdible()
                        .build())
        );
    }

}
