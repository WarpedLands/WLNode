package ru.warpedlands.WLNode.unit;

import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Ports;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Optional;

public class PortService {

    public static Optional<Integer> getAvailablePort(int startRange, int closingRange) {
        for(int i = startRange; i<=closingRange; i++) {
            try (ServerSocket socket = new ServerSocket(i)) {
                return Optional.of(i);
            } catch (IOException e) {
                //Not found port, continue mb
            }
        }
        return Optional.empty();
    }

    public static Ports getPortsFromIntExt(int externalPort, int internalPort) {
        Ports result = new Ports();
        result.bind(new ExposedPort(externalPort), Ports.Binding.bindPort(internalPort));
        return result;
    }
}
