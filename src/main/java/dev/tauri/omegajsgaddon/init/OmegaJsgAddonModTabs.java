
package dev.tauri.omegajsgaddon.init;

import dev.tauri.omegajsgaddon.omega_jsg_addon;
import net.minecraft.network.chat.Component;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmegaJsgAddonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, omega_jsg_addon.MODID);

	public static final RegistryObject<CreativeModeTab> OMEGA_JSG_ADDON = REGISTRY.register("omega_jsg_addon", () -> CreativeModeTab.builder()
		.withTabsBefore(CreativeModeTabs.COMBAT)
		.icon(() -> OmegaJsgAddonModItems.NAQUADAH_ORE.get().getDefaultInstance())
		.displayItems((parameters, output) -> {
			output.accept(OmegaJsgAddonModItems.NAQUADAH_ORE.get());
		}).title(Component.translatable("itemGroup.omega_jsg_addon")).build());


	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(OmegaJsgAddonModBlocks.NAQUADAH_ORE.get().asItem());
		}
	}
}
