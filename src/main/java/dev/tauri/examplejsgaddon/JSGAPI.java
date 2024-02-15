package dev.tauri.examplejsgaddon;

import dev.tauri.jsg.api.loader.model.APIOBJLoader;
import dev.tauri.jsg.api.loader.texture.APITextureLoader;

public class JSGAPI { 
    public static final APIOBJLoader EXAMPLE_OBJ_LOADER = APIOBJLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
    public static final APITextureLoader EXAMPLE_TEXTURE_LOADER = APITextureLoader.createLoader(ExampleJSGAddon.MODID, ExampleJSGAddon.class);
}
