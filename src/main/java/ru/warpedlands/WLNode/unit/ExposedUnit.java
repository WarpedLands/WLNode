package ru.warpedlands.WLNode.unit;

import com.github.dockerjava.api.model.Ports;

public abstract class ExposedUnit extends Unit {
    private Ports ports;
    public ExposedUnit(String image, String name, Ports ports, int dedicatedRamMb, int priority) {
        super(image, name, dedicatedRamMb, priority);
    }

    public Ports getPorts() {
        return ports;
    }
}
