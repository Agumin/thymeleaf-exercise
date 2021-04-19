package pl.agumin.thymeleafexercise;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AnimeController {
    private List<AnimeHusbando> animes;

   public AnimeController() {
        AnimeHusbando anime1 = new AnimeHusbando("AOT", "Levi Ackerman");
        AnimeHusbando anime2 = new AnimeHusbando("Naruto", "Kakashi Hatake");
        AnimeHusbando anime3 = new AnimeHusbando("Hellsing Ultimate", "Alucard");
        AnimeHusbando anime4 = new AnimeHusbando("Balance Unlimited", "Kabe Daisuke");
        animes = new ArrayList<>();
        animes.add(anime1);
        animes.add(anime2);
        animes.add(anime3);
        animes.add(anime4);

    }

    @GetMapping("/anime")
    public String getAnime(Model model) {
        model.addAttribute("animes", animes);
        model.addAttribute("newAnimeHusbando", new AnimeHusbando());
        return "anime";


    }

    @PostMapping("/add-anime")
    public String addAnime(@ModelAttribute AnimeHusbando anime) {
       animes.add(anime);
        return "redirect:/anime";
    }

}
