package dev.tauri.examplejsgaddon.jsgapi;

import dev.tauri.examplejsgaddon.ExampleJSGAddon;
import dev.tauri.jsg.api.loader.model.APIOBJLoader;
import dev.tauri.jsg.api.loader.texture.APITextureLoader;

public class JSGAPIHandler {
    public final APIOBJLoader EXAMPLE_OBJ_LOADER;
    public final APITextureLoader EXAMPLE_TEXTURE_LOADER;

    public JSGAPIHandler(){
        EXAMPLE_OBJ_LOADER = APIOBJLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
        EXAMPLE_TEXTURE_LOADER = APITextureLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
    }
}
