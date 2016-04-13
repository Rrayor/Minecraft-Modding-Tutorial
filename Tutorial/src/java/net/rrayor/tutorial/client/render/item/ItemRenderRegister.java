package net.rrayor.tutorial.client.render.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rrayor.tutorial.item.TutorialItems;

/**
 * Created by simon on 2016. 04. 13..
 */
public final class ItemRenderRegister {

    @SideOnly(Side.CLIENT)
    public static void registerItemRenderer(){
        reg(TutorialItems.tutorialItem);
    }

    public static void reg(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf('.') + 1),"Inventory"));
    }
}
