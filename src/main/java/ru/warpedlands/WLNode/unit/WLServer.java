package ru.warpedlands.WLNode.unit;

import java.util.UUID;

public class WLServer extends ExposedUnit {
    private ServerType serverType;
    public WLServer(ServerType serverType) {

        super(serverType.getFullImage(), serverType.name() + "-" + UUID.randomUUID(), PortService.getPortsFromIntExt(PortService.getAvailablePort(10000, 20000).get(), 25565), serverType.getDedicatedRamMb(), serverType.getServerPriority());
    }
}
