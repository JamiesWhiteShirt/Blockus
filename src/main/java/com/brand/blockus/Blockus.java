package com.brand.blockus;

import com.brand.blockus.content.ADGRelated;
import com.brand.blockus.content.Asphalt;
import com.brand.blockus.content.BambooPlanks;
import com.brand.blockus.content.Barrels;
import com.brand.blockus.content.BlazeBricks;
import com.brand.blockus.content.Bluestone;
import com.brand.blockus.content.ColoredTiles;
import com.brand.blockus.content.GlassRelated;
import com.brand.blockus.content.LavaBricks;
import com.brand.blockus.content.MagmaBricks;
import com.brand.blockus.content.NetherBricksRelated;
import com.brand.blockus.content.Other;
import com.brand.blockus.content.PaperRelated;
import com.brand.blockus.content.PatternedWools;
import com.brand.blockus.content.PolishedNetherrack;
import com.brand.blockus.content.PurpurRelated;
import com.brand.blockus.content.QuartzRelated;
import com.brand.blockus.content.SandstoneBricks;
import com.brand.blockus.content.SoakedBricks;
import com.brand.blockus.content.SoulSandstone;
import com.brand.blockus.content.StainedStoneBricks;
import com.brand.blockus.content.StoneRelated;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Blockus implements ModInitializer {
	
	public static final String MOD_ID = "blockus";
	public static final String VERSION = "1.1.5.2";
	public static final String NAME = "Blockus";
	public static final ItemGroup BLOCKUS_BUILDING_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blockus_building_blocks"), () -> new ItemStack(LavaBricks.LAVA_BRICKS));
	public static final ItemGroup BLOCKUS_DECORATIONS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blockus_decorations"), () -> new ItemStack(Other.SMALL_HEDGE));
	public static final ItemGroup BLOCKUS_REDSTONE = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blockus_redstone"), () -> new ItemStack(Blocks.REDSTONE_BLOCK));

	
	@Override
	public void onInitialize() {
		StainedStoneBricks.init();
		PatternedWools.init();
		ColoredTiles.init();
		GlassRelated.init();
		StoneRelated.init();
		Asphalt.init();
		ADGRelated.init();
		LavaBricks.init();
		MagmaBricks.init();
		SoakedBricks.init();
		SandstoneBricks.init();
		SoulSandstone.init();
		PurpurRelated.init();
		Bluestone.init();
		QuartzRelated.init();
		PaperRelated.init();
		PolishedNetherrack.init();
		NetherBricksRelated.init();
		BlazeBricks.init();
		BambooPlanks.init();
		Barrels.init();
		Other.init();
		instance.init();
		
   
	}
}
