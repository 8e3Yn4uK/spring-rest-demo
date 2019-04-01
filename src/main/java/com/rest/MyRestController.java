package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 8e3Yn4uK on 01.04.2019
 */

@RestController
@RequestMapping("/test")
public class MyRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
