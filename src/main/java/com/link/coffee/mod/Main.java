package com.link.coffee.mod;

import com.link.coffee.mod.registry.ModBlocks;
import com.link.coffee.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {




    public static final String MOD_ID = "coffeemod";





    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "main"))
            .icon(() -> new ItemStack(ModBlocks.CUP))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.CUP));
                stacks.add(new ItemStack(ModBlocks.LATTE_MACHIATO));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.register();
    }
}
