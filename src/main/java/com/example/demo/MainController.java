package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index(){
        return "안녕하세요";
    }
    
    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){
        return name + "님 환영입니다.";
    }

    @GetMapping("/now")
    public String now(){
        return "이제는 되야해";
    }
}
