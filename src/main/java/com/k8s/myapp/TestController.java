package com.k8s.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi/v1")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping
    public ResponseEntity<String> test() {
        System.out.println("PORT=" + port);
        return ResponseEntity.ok("Hello World :" + port);
    }
}
