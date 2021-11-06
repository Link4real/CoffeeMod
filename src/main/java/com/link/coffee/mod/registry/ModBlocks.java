package com.link.coffee.mod.registry;

import com.link.coffee.mod.Blocks.CupHorizontalBlock;
import com.link.coffee.mod.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    public static Block CUP = new CupHorizontalBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.ANCIENT_DEBRIS));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cup"), CUP);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cup"), new BlockItem(CUP, new FabricItemSettings().group(Main.ITEM_GROUP)));
    }
}
