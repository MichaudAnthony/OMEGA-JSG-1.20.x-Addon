
package dev.tauri.omegajsgaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import dev.tauri.omegajsgaddon.block.NaquadahOreBlock;
import dev.tauri.omegajsgaddon.omega_jsg_addon;

public class OmegaJsgAddonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, omega_jsg_addon.MODID);
	public static final RegistryObject<Block> NAQUADAH_ORE = REGISTRY.register("naquadah_ore", () -> new NaquadahOreBlock());

}
