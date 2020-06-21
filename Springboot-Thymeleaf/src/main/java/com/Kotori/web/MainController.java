package com.Kotori.web;

import com.Kotori.domain.Hero;
import com.Kotori.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private HeroService heroService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        List<Hero> heros = heroService.getAllHero();

        model.addAttribute("heros",heros);
        return "main";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping(value = "/addHero", method = RequestMethod.POST)
    public String addHero(Hero hero) {
        System.out.println(hero);
        heroService.insertHero(hero);
        return "redirect:main";
    }


}
