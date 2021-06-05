package ru.shcherban.springapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

/*    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name_parameter", required = false) String name,
                            @RequestParam(value = "surname_parameter", required = false) String surname,
                            Model model) {
        System.out.println("Hello, my friend " + name + " " + surname);
        model.addAttribute("message", "Hello, my friend " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }*/


    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") int b,
                             @RequestParam("action") String action,
                             Model model) {

        double result_value;

        switch (action) {
            case ("multiplication"):
                result_value = a * b;
                break;
            case ("division"):
                result_value = a / (double) b;
                break;
            case ("subtraction"):
                result_value = a - b;
                break;
            case ("addition"):
                result_value = a + b;
                break;
            default:
                result_value = 0;
                break;
        }
        model.addAttribute("result_key", result_value);

        return "first/calculator";
    }
}
