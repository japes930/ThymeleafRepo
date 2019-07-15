package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("x", "Say hello to the people.");
        model.addAttribute ( "turtles",  "I like turtles");
        model.addAttribute ( "num", "The magic number is 9" );
        return "hometemplate";
    }
}
