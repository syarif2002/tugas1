package com.ac.uin.syarifuddin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")

public class latihanaplikasi{
    @GetMapping("/hello")

    public String hello(){
        return "Selamat belajar Spring boot!";
    }
}