package cloud.wyx.yoooo.kupa.common;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class KupaGroup extends ItemGroup {
    public KupaGroup(){
        super("Kupa");
    }
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.itempkupa.get());
    }
}
