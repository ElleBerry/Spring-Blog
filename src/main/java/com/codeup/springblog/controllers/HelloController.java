package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @GetMapping(path="/goodbye")
    @ResponseBody
    public String goodbye(){
        return "goodbye";
    }

    @GetMapping(path="/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name){
        return "Howdy,"+name;
    }

    @GetMapping(path="/favnum/{num}")
    @ResponseBody
    public String getFavNum(@PathVariable int num){
        return "Fave num is"+num;
    }

    @RequestMapping(path="increment/{number", method= RequestMethod.GET)
    @ResponseBody
    public String addOns(@PathVariable int num){
        return num + "plus 1 is :" + (num+1);
    }
}
