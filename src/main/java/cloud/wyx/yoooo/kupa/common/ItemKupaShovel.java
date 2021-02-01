package cloud.wyx.yoooo.kupa.common;


import net.minecraft.item.ShovelItem;

public class ItemKupaShovel extends ShovelItem {
    public ItemKupaShovel() {
        super(KupaTier.KUPA,1.5F, -1F, new Properties().group(Kupa.itemGroup));
    }
}
