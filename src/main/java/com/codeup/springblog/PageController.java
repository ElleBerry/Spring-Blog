package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;

@Controller
public class PageController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/t/{name}")
    public String thyme(@PathVariable String name, Model model){
       model.addAttribute("username","ElleSpell");
       model.addAttribute("name", "Elle");
       model.addAttribute("numbers", Arrays.asList(1,2,3));
       return "thyme";
    }

}
