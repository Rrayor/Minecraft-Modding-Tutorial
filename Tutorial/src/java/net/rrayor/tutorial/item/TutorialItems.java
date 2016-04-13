package net.rrayor.tutorial.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by simon on 2016. 04. 13..
 */
public final class TutorialItems {

    public static Item tutorialItem=new BasicItem("tutorialItem");

    public static void init(){
        GameRegistry.registerItem(tutorialItem,"tutorialItem");
    }
}
