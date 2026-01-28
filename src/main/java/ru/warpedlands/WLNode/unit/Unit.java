package ru.warpedlands.WLNode.unit;

public abstract class Unit {
    private final int dedicatedRamMb;
    private final int priority;

    public Unit(int dedicatedRamMb, int priority) {
        this.dedicatedRamMb = dedicatedRamMb;
        this.priority = priority;
    }

    public void delete() {

    }

    public int getDedicatedRamMb() {
        return dedicatedRamMb;
    }

    public int getPriority() {
        return priority;
    }
}
