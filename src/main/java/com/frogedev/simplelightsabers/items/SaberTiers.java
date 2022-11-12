package com.frogedev.simplelightsabers.items;

import com.frogedev.simplelightsabers.common.registry.ItemInit;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class SaberTiers {
	
	public static final ForgeTier SINGLEBLADE = new ForgeTier(4, 3000, 0.8F, 0F, 0, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.KYBER_CRYSTAL.get()));

}
