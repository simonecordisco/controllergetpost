package com.example.controllergetpost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping(path="/name")
    public String name(@RequestParam String name){

        return name;


        }
    @PostMapping(path="/reverse-name")
    public String nameReverse(@RequestParam String name) {
        StringBuilder nameRev = new StringBuilder(name);
        nameRev.reverse();
        return nameRev.toString();
    }

    }
