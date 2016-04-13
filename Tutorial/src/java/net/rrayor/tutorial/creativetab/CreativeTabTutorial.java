package net.rrayor.tutorial.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.rrayor.tutorial.reference.Reference;

/**
 * Created by simon on 2016. 04. 13..
 */
public class CreativeTabTutorial {

    public static final CreativeTabs tutorialTab = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Items.banner;
        }
    };
}
