package net.ecler.slepoikot.blocks;

import net.ecler.slepoikot.Slepoikot;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block OAKLOG_IRONFRAME = registerBlock("oaklog_ironframe",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block OAKPLANKS_IRONFRAME = registerBlock("oakplanks_ironframe",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Dyeable Stone
    public static final Block STONE_BLACK = registerBlock("stone_black",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_RED = registerBlock("stone_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_GREEN = registerBlock("stone_green",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_BROWN = registerBlock("stone_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_BLUE = registerBlock("stone_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_PURPLE = registerBlock("stone_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_CYAN = registerBlock("stone_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_LIGHTGRAY = registerBlock("stone_lightgray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_PINK = registerBlock("stone_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_YELLOW = registerBlock("stone_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_LIGHTBLUE = registerBlock("stone_lightblue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_ORANGE = registerBlock("stone_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_WHITE = registerBlock("stone_white",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Slepoikot.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
      return Registry.register(Registries.ITEM, new Identifier(Slepoikot.MOD_ID, name),
          new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Slepoikot.LOGGER.info(Slepoikot.MOD_ID + " Registering Mod Blocks");
    }

}
