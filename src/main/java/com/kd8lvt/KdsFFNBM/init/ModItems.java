package com.kd8lvt.KdsFFNBM.init;

import com.kd8lvt.KdsFFNBM.item.ItemWrapperFFNBM;
import com.kd8lvt.KdsFFNBM.item.itemFlour;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by KD8LVT on 2/17/2015.
 */
public class ModItems {
    public static final ItemWrapperFFNBM flour = new itemFlour();

    public static void init(){
        GameRegistry.registerItem(flour, "wheatFlour");
    }

}
