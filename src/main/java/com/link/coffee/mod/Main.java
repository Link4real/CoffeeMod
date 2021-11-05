package com.link.coffee.mod;

import com.link.coffee.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {




    public static final String MOD_ID = "coffeemod";







    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
