package net.rrayor.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.rrayor.tutorial.client.render.item.ItemRenderRegister;
import net.rrayor.tutorial.item.TutorialItems;
import net.rrayor.tutorial.proxy.IProxy;
import net.rrayor.tutorial.reference.Reference;

/**
 * Created by simon on 2016. 04. 13..
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        TutorialItems.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent e){
        ItemRenderRegister.registerItemRenderer();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}
