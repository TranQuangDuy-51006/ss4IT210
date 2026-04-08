package re.ss04it210.bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai2")
public class MenuController {

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(defaultValue = "chay") String category
    ) {
        return "Menu loai: " + category;
    }
}