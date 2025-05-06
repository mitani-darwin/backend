package com.daisuke2.planing.planing.Index;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoroller {
    
    @GetMapping("/")
    public Map<String, String> index() {
        return Map.of("message", "Hello, JSON!");
    }
}
