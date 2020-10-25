package com.lee.l33mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class OreBase extends OreBlock
{
    public OreBase() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        if(silktouch == 1) return 0;
        return (int)(Math.floor(Math.random()*4)+3);
    }
}
