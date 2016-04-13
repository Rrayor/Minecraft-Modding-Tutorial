package net.rrayor.tutorial.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by simon on 2016. 04. 13..
 */
public class TutorialBlocks {

    public static Block tutorialBlock=new BasicBlock("tutorialBlock");

    public static void init(){
        GameRegistry.registerBlock(tutorialBlock, "tutorialBlock");
    }
}
