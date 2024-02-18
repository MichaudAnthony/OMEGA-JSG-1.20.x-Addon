package dev.tauri.examplejsgaddon.jsgapi;

import dev.tauri.examplejsgaddon.ExampleJSGAddon;
import dev.tauri.jsg.api.loader.model.APIOBJLoader;
import dev.tauri.jsg.api.loader.texture.APITextureLoader;

public class JSGAPIHandler {
    public static final APIOBJLoader EXAMPLE_OBJ_LOADER = APIOBJLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
    public static final APITextureLoader EXAMPLE_TEXTURE_LOADER = APITextureLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
}
