package ru.warpedlands.WLNode.unit;

public abstract class Unit {
    private final String name;
    private final int dedicatedRamMb;
    private final int priority;
    private final String image;

    public Unit(String image, String name, int dedicatedRamMb, int priority) {
        this.image = image;
        this.name = name;
        this.dedicatedRamMb = dedicatedRamMb;
        this.priority = priority;
    }

    public void delete() {

    }

    public String getName() {
        return name;
    }

    public int getDedicatedRamMb() {
        return dedicatedRamMb;
    }

    public int getPriority() {
        return priority;
    }

    public String getImage() {
        return image;
    }
}
