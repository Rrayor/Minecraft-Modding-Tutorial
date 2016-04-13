package net.rrayor.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.rrayor.tutorial.creativetab.CreativeTabTutorial;
import net.rrayor.tutorial.reference.Reference;

/**
 * Created by simon on 2016. 04. 13..
 */
public class BasicBlock extends Block {

    public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabTutorial.tutorialTab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        /*
        this.setStepSound();
        this.setLightOpacity();     //0-16
        this.setLightLevel();       //0.0F-1.0F
        this.setHarvestLevel();     //("pickaxe", "axe", "shovel"), 0-3
        this.setBlockUnBreakable();
        this.setTickRandomly();
        * */
    }

    public BasicBlock(String unlocalizedName, float hardness, float resistance){
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName){
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ':', getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf('.')+1);
    }
}
