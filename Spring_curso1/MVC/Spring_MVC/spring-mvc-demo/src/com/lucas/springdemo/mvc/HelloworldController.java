package com.lucas.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloworldController {
    
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloword";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServeletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "yo! " + theName;

        model.addAttribute("message", result);

        return "helloWorld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
        @RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();

        String result = "Hello! " + theName;

        model.addAttribute("message", result);

        return "helloWorld";
    }

}