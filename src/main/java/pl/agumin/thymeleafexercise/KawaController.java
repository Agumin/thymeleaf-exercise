package pl.agumin.thymeleafexercise;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class KawaController {

    @GetMapping("/kawa")
    public String get(Model model) {
        AnimeHusbando anime = new AnimeHusbando("AOT", "Levi Ackerman");
        AnimeHusbando anime1 = new AnimeHusbando("Naruto", "Kakashi Hatake");
        AnimeHusbando anime2 = new AnimeHusbando("Hellsing Ultimate", "Alucard");
        AnimeHusbando anime3 = new AnimeHusbando("Balance Unlimited", "Kabe Daisuke");
        List<AnimeHusbando> animes = Arrays.asList(anime,anime1, anime2, anime3);

        model.addAttribute("animes", animes);
        return "kawa";
    }

}
