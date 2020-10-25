package com.lee.l33mod.blocks;

import com.lee.l33mod.L33Mod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(L33Mod.TAB));
    }
}
