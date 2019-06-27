package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String posts(){
        return "List of posts...";
    }

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String shwo(@PathVariable long id){
        return "showing posts from user:"+id;
    }

    @GetMapping(path = "/posts/create")
    @ResponseBody
    public String create(){
        return "create posts";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    public void insert(){

    }

}
