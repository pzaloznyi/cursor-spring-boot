package com.pzaloznyi.cursorspringboot.controllers.api;

import com.pzaloznyi.utils.UUIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ConfigRestApiController {

    private UUIDService uuidService;

    public ConfigRestApiController(@Autowired UUIDService uuidService) {

        this.uuidService = uuidService;
    }

    @GetMapping("/uuids")
    public List<UUID> get(@RequestParam long size) {
        return uuidService.generate(size);
    }
}
