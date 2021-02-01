package cloud.wyx.yoooo.kupa.common;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> itempp = ITEMS.register("toilet_paper", ItemPP::new);
    public static final RegistryObject<Item> itempkupa = ITEMS.register("shit_paper", ItemPKupa::new);
    public static final RegistryObject<Item> itemkupain = ITEMS.register("shit_brick", ItemKupaIn::new);
    public static final RegistryObject<Item> kupasword = ITEMS.register("shit_sword", ItemKupaSword::new);
    public static final RegistryObject<Item> kupashovel = ITEMS.register("shit_shovel", ItemKupaShovel::new);
    public static final RegistryObject<Item> kupapickaxe = ITEMS.register("shit_pickaxe", ItemKupaPickaxe::new);
    public static final RegistryObject<Item> kupahoe = ITEMS.register("shit_hoe", ItemKupaHoe::new);
    public static final RegistryObject<Item> kupaaxe = ITEMS.register("shit_axe", ItemKupaAxe::new);
    public static final RegistryObject<Item> kupaHelmet = ITEMS.register("shit_helmet", () -> new ArmorItem(KupaArmorMaterial.KUPA, EquipmentSlotType.HEAD, (new Item.Properties()).group(Kupa.itemGroup)));
    public static final RegistryObject<Item> kupaplate = ITEMS.register("shit_chestplate", () -> new ArmorItem(KupaArmorMaterial.KUPA, EquipmentSlotType.CHEST, (new Item.Properties()).group(Kupa.itemGroup)));
    public static final RegistryObject<Item> kupalegs = ITEMS.register("shit_leggings", () -> new ArmorItem(KupaArmorMaterial.KUPA, EquipmentSlotType.LEGS, (new Item.Properties()).group(Kupa.itemGroup)));
    public static final RegistryObject<Item> kupaboots = ITEMS.register("shit_boots", () -> new ArmorItem(KupaArmorMaterial.KUPA, EquipmentSlotType.FEET, (new Item.Properties()).group(Kupa.itemGroup)));
    public static final RegistryObject<Item> blockkupa = ITEMS.register("shit", () -> new BlockItem(BlockRegistry.blockkupa.get(), new Item.Properties().group(Kupa.itemGroup)));
    public static final RegistryObject<Item> blockskupa = ITEMS.register("shit_super", () -> new BlockItem(BlockRegistry.blockskupa.get(), new Item.Properties().group(Kupa.itemGroup)));
    public static final RegistryObject<Item> blocktoilet= ITEMS.register("toilet",()-> new BlockItem(BlockRegistry.blocktoilet.get(), new Item.Properties().group(Kupa.itemGroup)));
}
