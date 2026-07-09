package org.aminesidki.be04.controller;

import lombok.RequiredArgsConstructor;
import org.aminesidki.be04.MessageService;
import org.aminesidki.be04.dto.MessageDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MainController {
    private final MessageService service;

    @GetMapping
    public List<MessageDto> getAll(){
        return service.fetchAll();
    }

    @PostMapping
    public void seed(){
        service.seed();
    }
}
