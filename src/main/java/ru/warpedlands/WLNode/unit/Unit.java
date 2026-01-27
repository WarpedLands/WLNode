package ru.warpedlands.WLNode.unit;

public abstract class Unit {
    private int dedicatedRamMb;
    private int priority;

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
