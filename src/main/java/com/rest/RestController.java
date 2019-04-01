package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 8e3Yn4uK on 01.04.2019
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
