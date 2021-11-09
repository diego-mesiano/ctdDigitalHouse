package com.diego.TesteSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {

    @RequestMapping("/acessarMetodoHello")
    @ResponseBody

    public String hello(){
        return "Hello Word!!!!!!!\nEm Spring Boot";
    }
}
