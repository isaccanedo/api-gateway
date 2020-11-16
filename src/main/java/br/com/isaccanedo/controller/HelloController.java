package br.com.isaccanedo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isac Canedo
 */

@RestController
public class HelloController {

    @GetMapping("/local/hello")
    public String hello() {
        return "Local Hello World";
    }
}
