package ru.warpedlands.WLNode.unit;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class UnitDockerService {
    public void activateUnit(Unit unit) {
        DefaultDockerClientConfig.Builder config
                = DefaultDockerClientConfig.createDefaultConfigBuilder();
        DockerClient dockerClient = DockerClientBuilder
                .getInstance(config)
                .build();
        CreateContainerCmd command = dockerClient.createContainerCmd(unit.getImage());

        if(unit instanceof ExposedUnit) {
            command.withHostConfig(HostConfig.newHostConfig().withPortBindings(((ExposedUnit) unit).getPorts()));
        }
        command.withName(unit.getName());
        command.exec();
    }
}
