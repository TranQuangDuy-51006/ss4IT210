package re.ss04it210.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai2")
public class MenuController {

    @GetMapping("/menu")
    public String getMenu(
            @RequestParam(value = "category", defaultValue = "chay") String category,
            Model model
    ) {
        model.addAttribute("category", category);
        return "menu";
    }
}