package me.jellysquid.mods.sodium.client.render.pipeline;

import me.jellysquid.mods.sodium.client.model.quad.blender.ColorBlender;
import me.jellysquid.mods.sodium.client.model.quad.blender.FlatColorBlender;
import me.jellysquid.mods.sodium.client.model.quad.blender.LinearColorBlender;
import net.minecraft.client.Minecraft;

public class ChunkRenderCache {
    protected ColorBlender createBiomeColorBlender() {
        return Minecraft.getInstance().options.biomeBlendRadius <= 0 ? new FlatColorBlender() : new LinearColorBlender();
    }
}
