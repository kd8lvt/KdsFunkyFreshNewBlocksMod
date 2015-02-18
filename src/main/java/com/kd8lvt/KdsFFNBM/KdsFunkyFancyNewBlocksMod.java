package com.kd8lvt.KdsFFNBM;


import com.kd8lvt.KdsFFNBM.init.ModItems;
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
    @SidedProxy(clientSide = "com.kd8lvt.KdsFFNBM.proxy.ClientProxy", serverSide = "com.kd8lvt.KdsFFNBM.proxy.ServerProxy")
    public static IProxy proxy;
    @Mod.Instance("KdsFunkyFancyNewBlocksMod")
        public static KdsFunkyFancyNewBlocksMod instance;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //Network Handling
        //Mod Config
        //Items
        ModItems.init();
        //Blocks
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
