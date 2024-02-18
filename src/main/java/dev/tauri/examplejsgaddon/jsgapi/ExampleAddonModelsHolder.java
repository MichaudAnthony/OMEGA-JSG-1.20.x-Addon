package dev.tauri.examplejsgaddon.jsgapi;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.tauri.jsg.api.TextureOverlay;
import dev.tauri.jsg.api.loader.holder.ExampleTextureOverlay;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ExampleAddonModelsHolder {
    EXAMPLE_MODEL("my_model.obj", "my_texture.obj", true);

    public final ResourceLocation model;
    public final Map<TextureOverlay, ResourceLocation> biomeTextureResourceMap = new HashMap<>();
    private final List<TextureOverlay> nonExistingReported = new ArrayList<>();

    ExampleAddonModelsHolder(String modelPath, String texturePath, boolean byOverlay) {
        this.model = JSGAPIHandler.EXAMPLE_OBJ_LOADER.getModelResource(modelPath);
        ExampleTextureOverlay[] overlays = ExampleTextureOverlay.values();

        for (ExampleTextureOverlay texOverlay : overlays) {
            if (!byOverlay) {
                this.biomeTextureResourceMap.put(texOverlay, JSGAPIHandler.EXAMPLE_TEXTURE_LOADER.getTextureResource(texturePath));
            } else {
                String[] split = texturePath.split("\\.");
                this.biomeTextureResourceMap.put(texOverlay, JSGAPIHandler.EXAMPLE_TEXTURE_LOADER.getTextureResource(split[0] + texOverlay.getSuffix() + "." + split[1]));
            }
        }

    }

    public void render(PoseStack ps) {
        JSGAPIHandler.EXAMPLE_OBJ_LOADER.getModel(this.model).render(ps);
    }

    public void bindTexture(TextureOverlay overlay) {
        ResourceLocation resourceLocation = this.biomeTextureResourceMap.get(overlay);
        this.bindTexture(overlay, resourceLocation);
    }

    private void bindTexture(TextureOverlay overlay, ResourceLocation resourceLocation) {
        if (!JSGAPIHandler.EXAMPLE_TEXTURE_LOADER.isTextureLoaded(resourceLocation)) {
            if (!this.nonExistingReported.contains(overlay)) {
                // doesn't exists
                this.nonExistingReported.add(overlay);
            }

            resourceLocation = this.biomeTextureResourceMap.get(ExampleTextureOverlay.NORMAL);
        }

        JSGAPIHandler.EXAMPLE_TEXTURE_LOADER.getTexture(resourceLocation).bindTexture();
    }

    public void bindTextureAndRender(PoseStack ps) {
        this.bindTextureAndRender(ExampleTextureOverlay.NORMAL, ps);
    }

    public void bindTextureAndRender(TextureOverlay biomeOverlay, PoseStack ps) {
        this.bindTexture(biomeOverlay);
        this.render(ps);
    }
}