package pl.agumin.thymeleafexercise;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KawaController {

    @GetMapping("/kawa")
    public String get(Model model) {
        model.addAttribute("name", "espresso");
        return "kawa";
    }

}
