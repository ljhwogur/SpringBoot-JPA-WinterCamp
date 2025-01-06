package com.example.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homePage(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name",name);
        System.err.println("1");
        return "home";  // home.html 파일로 매핑
    }
}
