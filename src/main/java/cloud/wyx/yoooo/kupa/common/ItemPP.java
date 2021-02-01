package cloud.wyx.yoooo.kupa.common;


import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;

import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.Collection;
import java.util.List;


public class ItemPP extends Item {
    public ItemPP() {

        super(new Properties().group(Kupa.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(playerIn.isSneaking() && (worldIn.getBlockState(playerIn.getPosition().down()).getBlock().getRegistryName().toString().contains("toilet")) && playerIn.getFoodStats().getFoodLevel() >= 14 ) {
            if (worldIn.isRemote) {
                worldIn.playSound(playerIn, playerIn.getPosition(), Kupa.shitsound.get(), SoundCategory.AMBIENT, 10f, 1f);
            }
            if (!playerIn.abilities.isCreativeMode) {
                int i=0;
                int j=0;
                Collection<EffectInstance> c = playerIn.getActivePotionEffects();
                for(EffectInstance ef : c) {
                    if( ef!=null && ef.getPotion().getName().contains("hunger")){
                        i+=ef.getDuration();
                    }
                    if( ef!=null && ef.getPotion().getName().contains("poison")){
                        j+=ef.getDuration();
                    }
                }
                EffectInstance effect = new EffectInstance(Effects.HUNGER, i+600, 0);
                if(i>6000) {
                    effect = new EffectInstance(Effects.POISON, j+200, 0);
                }
                playerIn.addPotionEffect(effect);
                playerIn.getHeldItem(handIn).shrink(1);
                playerIn.addItemStackToInventory(new ItemStack(ItemRegistry.itempkupa.get()));
            }
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public  void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("kupa.toilet_paper.args", "Enjoy sneaking on the toilet."));
        tooltip.add(new TranslationTextComponent("kupa.toilet_paper.args1","remember to clean your ass when you finish!"));
        tooltip.add(new TranslationTextComponent("kupa.toilet_paper.args2","SHIFT + right click on the toilet to use it."));
        super.addInformation(stack,worldIn,tooltip,flagIn );
    }
}
