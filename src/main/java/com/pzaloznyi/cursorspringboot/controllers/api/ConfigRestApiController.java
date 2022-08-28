package com.pzaloznyi.cursorspringboot.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ConfigRestApiController {

    @GetMapping("/uuids")
    public List<UUID> get(@RequestParam long size) {
        return Stream.generate(UUID::randomUUID)
                .limit(size)
                .collect(Collectors.toList());
    }
}
