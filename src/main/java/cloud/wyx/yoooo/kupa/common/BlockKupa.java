package cloud.wyx.yoooo.kupa.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class BlockKupa extends Block {
    public BlockKupa(){
        super(Properties.create(Material.EARTH).hardnessAndResistance(0.5F, 1F).slipperiness(1.1F).sound(SoundType.GROUND));
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }
}
