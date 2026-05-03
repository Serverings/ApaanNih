package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")     
public class VoteController {

    private int yes = 0;
    private int no = 0;

    @PostMapping("/yes")
    public String yes() {
        yes++;
        return "yes: " + yes;
    }

    @PostMapping("/no")
    public String no() {
        no++;
        return "no: " + no;
    }

    @GetMapping("/result")
    public Map<String, Integer> result() {
        return Map.of("yes", yes, "no", no);
    }
}