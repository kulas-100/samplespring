package com.example.demo2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SampleController {
    @GetMapping("/")
    public String gethello(){
        return "Hello world";
    }

}
