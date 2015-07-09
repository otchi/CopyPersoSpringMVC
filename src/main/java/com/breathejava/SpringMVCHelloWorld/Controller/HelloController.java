package com.breathejava.SpringMVCHelloWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/index.htm")
    public String IndexPage(ModelMap model){
        model.addAttribute("message", "Hello World from Server697");
        return "index";
    }
}
