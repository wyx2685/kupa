package cloud.wyx.yoooo.kupa.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockSKupa extends Block {
    public BlockSKupa(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(5F, 100000F));
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }


}
