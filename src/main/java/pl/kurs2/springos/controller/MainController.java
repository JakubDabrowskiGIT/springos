package pl.kurs2.springos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/if")
    public String ifStatement(ModelMap modelMap) {
        modelMap.addAttribute("text", "Michał");
        modelMap.addAttribute("myText", "Sample text");
        modelMap.addAttribute("a", "123");
        modelMap.addAttribute("b", "456");
        return "first";

    }


    @GetMapping("/bookadd")
    public String formBook(ModelMap modelMap) {
        modelMap.addAttribute("text", "Michał");
        modelMap.addAttribute("myText", "Sample text");
        modelMap.addAttribute("a", "123");
        modelMap.addAttribute("b", "456");
        return "book";

    }

}