package pl.stirlitzapp.stirlitzjokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.stirlitzapp.stirlitzjokesapp.services.JokesService;

@Controller
public class JokeController {

    private final JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}
