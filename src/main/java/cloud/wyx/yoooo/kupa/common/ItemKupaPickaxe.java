package cloud.wyx.yoooo.kupa.common;


import net.minecraft.item.PickaxeItem;

public class ItemKupaPickaxe extends PickaxeItem {
    public ItemKupaPickaxe() {
        super(KupaTier.KUPA,1, -0.9F, new Properties().group(Kupa.itemGroup));
    }
}
