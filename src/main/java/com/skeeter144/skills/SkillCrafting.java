package com.skeeter144.skills;

import java.util.ArrayList;
import java.util.HashMap;

import com.skeeter144.items.ISItems;
import com.skeeter144.items.ISTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SkillCrafting {
	
	static ArrayList<Recipe> recipes;
	
	public static void init(){
		recipes = new ArrayList<Recipe>();
		
		
		ArrayList<ItemStack> chiselList = new ArrayList<ItemStack>();
		chiselList.add(new ItemStack(Blocks.cobblestone, 5));
		chiselList.add(new ItemStack(Items.stick, 1));
		recipes.add(new Recipe(new ItemStack(ISItems.chisel,1), chiselList, 1, 5, 0));
		
		ArrayList<ItemStack> hatchetList = new ArrayList<ItemStack>();
		hatchetList.add(new ItemStack(Blocks.cobblestone, 1));
		hatchetList.add(new ItemStack(Items.stick, 1));
		hatchetList.add(new ItemStack(Blocks.vine, 1));
		recipes.add(new Recipe(new ItemStack(ISTools.makeshiftHatchet, 1), hatchetList, 2, 10, 1));
	}
	
	
	
	public static ArrayList<Recipe>  getRecipes(){
		return recipes;
	}
	
	public static Recipe getRecipeForId(int id){
		for(int i = 0; i < recipes.size(); ++i){
			if(recipes.get(i).getId() == id){
				return recipes.get(i);
			}
		}
		return null;
	}
	

}
