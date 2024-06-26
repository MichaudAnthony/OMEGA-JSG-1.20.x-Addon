
package dev.tauri.omegajsgaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import dev.tauri.omegajsgaddon.omega_jsg_addon;

public class OmegaJsgAddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, omega_jsg_addon.MODID);
	public static final RegistryObject<Item> NAQUADAH_ORE = block(OmegaJsgAddonModBlocks.NAQUADAH_ORE);


	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
