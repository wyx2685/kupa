package cloud.wyx.yoooo.kupa.common;


import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ItemKupaSword extends SwordItem {
    public ItemKupaSword() {
        super(KupaTier.KUPA,3, -1F, new Item.Properties().group(Kupa.itemGroup));
    }
}
