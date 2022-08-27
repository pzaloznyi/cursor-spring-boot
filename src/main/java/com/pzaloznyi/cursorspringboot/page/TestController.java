package com.pzaloznyi.cursorspringboot.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/test")
    public String indexPage(@RequestParam("number") int number, Model model) {
        model.addAttribute("title", "My super page");
        model.addAttribute("number", number * 2);
        return "test";
    }
}
