package com.lucas.springdemo.mvc;

@Controller
public class SillyController {
    
    @RequestMapping("/showForm")
    public String displayForm() {
        return "silly";
    }

    
}