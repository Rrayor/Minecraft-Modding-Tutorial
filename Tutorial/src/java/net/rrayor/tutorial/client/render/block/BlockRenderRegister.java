package net.rrayor.tutorial.client.render.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rrayor.tutorial.block.TutorialBlocks;

/**
 * Created by simon on 2016. 04. 13..
 */
public class BlockRenderRegister {

    @SideOnly(Side.CLIENT)
    public static void registerBlockRenderer(){
        reg(TutorialBlocks.tutorialBlock);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf('.')+1), "inventory"));
    }
}
