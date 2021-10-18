package com.lucas.springdemo.mvc;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }    

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }

}