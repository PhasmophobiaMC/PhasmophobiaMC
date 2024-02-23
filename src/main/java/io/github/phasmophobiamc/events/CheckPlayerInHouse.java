package io.github.phasmophobiamc.events;

import io.github.phasmophobiamc.util.Location;
import io.github.phasmophobiamc.util.Region;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class CheckPlayerInHouse implements ServerTickEvents.StartTick {
    private final Region region = new Region("Хуй",
            new Location(-3.0, -64.0, 20.0),
            new Location(4.0, -56.0, 26.0));
    @Override
    public void onStartTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if (region.isPlayerInRegion(player)) {
                player.sendMessage(Text.of("Хуйхуйхуйхуй"));
            }
        }
    }
}