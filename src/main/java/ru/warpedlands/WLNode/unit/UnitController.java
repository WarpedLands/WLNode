package ru.warpedlands.WLNode.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/api/v1/units/servers/")
@Controller()
public class UnitController {
    @Autowired
    private UnitDockerService unitDockerService;

    @PostMapping("/new")
    public ResponseEntity<?> createServer(@RequestParam("serverType") String serverType) {
        ServerType serverTypeEnum = ServerType.getServerTypeFromString(serverType);
        if(serverTypeEnum == null) {
            return new ResponseEntity<>("ServerType " + serverType + " not found", HttpStatus.BAD_REQUEST);
        }
        WLServer wlServer = new WLServer(serverTypeEnum);
        unitDockerService.activateUnit(wlServer);
        return ResponseEntity.ok()
                .body(wlServer);
    }
}
