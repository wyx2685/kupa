package cloud.wyx.yoooo.kupa.common;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;

public class BlockToilet extends HorizontalBlock {
    private static IntegerProperty STATE = IntegerProperty.create("water", 0, 3);

    public BlockToilet(){
        super(Properties.create(Material.IRON).hardnessAndResistance(5F, 1F).sound(SoundType.METAL));
        this.setDefaultState(this.getStateContainer().getBaseState().with(STATE, 3).with(HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        builder.add(HORIZONTAL_FACING);
        super.fillStateContainer(builder);
    }

}

