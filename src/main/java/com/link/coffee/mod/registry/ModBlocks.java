package com.link.coffee.mod.registry;

import com.link.coffee.mod.Blocks.CupHorizontalBlock;
import com.link.coffee.mod.Blocks.LatteMachiattoCakeItem;
import com.link.coffee.mod.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.coffee.mod.Main.MOD_ID;

public class ModBlocks {


    public static Block CUP = new CupHorizontalBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.ANCIENT_DEBRIS));
    public static LatteMachiattoCakeItem LATTE_MACHIATO = new LatteMachiattoCakeItem(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.BONE));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cup"), CUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cup"), new BlockItem(CUP, new FabricItemSettings().group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "latte_machiatto"), LATTE_MACHIATO);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "latte_machiattp"), new BlockItem(LATTE_MACHIATO, new FabricItemSettings().group(Main.ITEM_GROUP)));
    }
}
