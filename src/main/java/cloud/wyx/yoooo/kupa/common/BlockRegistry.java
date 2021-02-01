package cloud.wyx.yoooo.kupa.common;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> blockkupa = BLOCKS.register("shit", BlockKupa::new);
    public static final RegistryObject<Block> blockskupa = BLOCKS.register("shit_super", BlockSKupa::new);
    public static final RegistryObject<Block> blocktoilet = BLOCKS.register("toilet",BlockToilet::new);
}