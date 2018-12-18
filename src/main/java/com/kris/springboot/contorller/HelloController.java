package com.kris.springboot.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你哈");
        return "success";
    }
}
