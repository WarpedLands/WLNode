package ru.warpedlands.WLNode.unit;

public class WLServer extends ExposedUnit {
    private ServerType serverType;
    public WLServer(ServerType serverType) {
        super(serverType.getDedicatedRamMb(), serverType.getServerPriority());
    }
}
