package io.github.phasmophobiamc.util;

import net.minecraft.server.network.ServerPlayerEntity;

public class Region {
    public String name;
    public Location corner1;
    public Location corner2;

    public Region(String name, Location corner1, Location corner2) {
        this.name = name;
        this.corner1 = corner1;
        this.corner2 = corner2;
    }

    public boolean isPlayerInRegion(ServerPlayerEntity player) {
        Location playerLocation = new Location(player.getX(), player.getY(), player.getZ());
        return ((playerLocation.x > corner1.x) && (playerLocation.y > corner1.y) &&
                (playerLocation.z > corner1.z) && (playerLocation.x < corner2.x) && (playerLocation.y < corner2.y) &&
                (playerLocation.z < corner2.z));
    }

}
