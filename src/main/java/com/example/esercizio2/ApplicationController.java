package com.example.esercizio2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class ApplicationController {
    @GetMapping(path = "/ciao/{provincia}")
    public User greets(@RequestParam(required = true) String nome,
                       @PathVariable(required = true) String provincia) {
        return new User(nome, provincia);

    }
}
