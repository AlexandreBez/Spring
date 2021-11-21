package com.lucas.springdemo.mvc;

@Controller
@RequestMapping("/customer")
public class CustomerController {
 
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomerEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("showForm")
    public String showForme(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("processForm")
    public String processForm(
        @Valid 
        @ModelAttribute("customer") Customer theCustumer, 
        BindingResult theBindingResult){

        System.out.println("last name: |" + theCustumer.getLastName() + "|");

        System.out.println("Binding result: " + theBindingResult);

        System.out.println("\n\n\n\n\n");
        
        if (theBindingResult.hasErrors()) {
            return "customer-form";
        }
        else {
            return "customer-confirmation";
    
        }
    }
}