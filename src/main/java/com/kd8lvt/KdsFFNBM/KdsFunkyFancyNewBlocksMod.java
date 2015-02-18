package com.kd8lvt.KdsFFNBM;


import com.kd8lvt.KdsFFNBM.proxy.IProxy;
import com.kd8lvt.KdsFFNBM.refrence.Refrence;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Refrence.MOD_ID,name=Refrence.MOD_NAME,version= Refrence.VERSION)
public class KdsFunkyFancyNewBlocksMod {
    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    @Mod.Instance("KdsFunkyFancyNewBlocksMod")
        public static KdsFunkyFancyNewBlocksMod instance;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        /*
        Network Handling
        Mod Config
        Items
        Blocks
        */
    }
    @EventHandler
    public void Init(FMLInitializationEvent event){
        /*
        Guis
        Tile Entities
        Crafting Recipes
        */
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        // Mod Interaction
    }
}
