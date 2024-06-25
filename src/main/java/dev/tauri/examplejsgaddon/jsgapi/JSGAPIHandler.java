package dev.tauri.examplejsgaddon.jsgapi;

import dev.tauri.examplejsgaddon.omega_jsg_addon;
import dev.tauri.jsg.api.loader.model.APIOBJLoader;
import dev.tauri.jsg.api.loader.texture.APITextureLoader;

public class JSGAPIHandler {
    public final APIOBJLoader EXAMPLE_OBJ_LOADER;
    public final APITextureLoader EXAMPLE_TEXTURE_LOADER;

    public JSGAPIHandler(){
        EXAMPLE_OBJ_LOADER = APIOBJLoader.createLoader(omega_jsg_addon.MODID, omega_jsg_addon.class);
        EXAMPLE_TEXTURE_LOADER = APITextureLoader.createLoader(omega_jsg_addon.MODID, omega_jsg_addon.class);
    }
}
