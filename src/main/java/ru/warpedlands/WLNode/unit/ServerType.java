package ru.warpedlands.WLNode.unit;

public enum ServerType {
    HUB("warpedlands/hub-server", "1.0", 1024, 1);

    private String image;
    private String preferredVersion;
    private int dedicatedRamMb;
    private int serverPriority;

    public String getFullImage() {
        return image + ":" + preferredVersion;
    }

    public static ServerType getServerTypeFromString(String name) {
        for(ServerType serverType : ServerType.values()) {
            if(serverType.name().equalsIgnoreCase(name)) {
                return serverType;
            }
        }
        return null;
    }

    ServerType(String image, String preferredVersion, int dedicatedRamMb, int serverPriority) {
        this.image = image;
        this.preferredVersion = preferredVersion;
        this.dedicatedRamMb = dedicatedRamMb;
        this.serverPriority = serverPriority;
    }

    public int getDedicatedRamMb() {
        return dedicatedRamMb;
    }

    public int getServerPriority() {
        return serverPriority;
    }
}
