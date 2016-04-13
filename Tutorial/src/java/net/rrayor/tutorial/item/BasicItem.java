package net.rrayor.tutorial.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rrayor.tutorial.creativetab.CreativeTabTutorial;
import net.rrayor.tutorial.reference.Reference;

/**
 * Created by simon on 2016. 04. 13..
 */
public class BasicItem extends Item {

    public BasicItem(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabTutorial.tutorialTab);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ':', getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s",Reference.MOD_ID.toLowerCase() + ':', getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf('.')+1);
    }
}
