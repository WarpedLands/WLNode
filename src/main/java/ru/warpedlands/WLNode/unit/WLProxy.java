package ru.warpedlands.WLNode.unit;

import java.util.UUID;

public class WLProxy extends ExposedUnit {
    public WLProxy(int dedicatedRamMb, int priority) {
        super("warpedlands/wl-proxy:1.0", "proxy-" + UUID.randomUUID(), PortService.getPortsFromIntExt(25565, 25565), dedicatedRamMb, priority);
    }
}
