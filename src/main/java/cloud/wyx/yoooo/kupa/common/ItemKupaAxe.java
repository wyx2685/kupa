package cloud.wyx.yoooo.kupa.common;


import net.minecraft.item.AxeItem;

public class ItemKupaAxe extends AxeItem {
    public ItemKupaAxe() {
        super(KupaTier.KUPA,6, -1.05F, new Properties().group(Kupa.itemGroup));
    }
}
