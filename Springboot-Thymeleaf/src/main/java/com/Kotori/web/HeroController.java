package com.Kotori.web;

import com.Kotori.domain.Hero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Kotori.service.HeroService;

import java.util.List;


@Controller
public class HeroController {
    @Autowired
    private HeroService heroService;

    Logger log = LoggerFactory.getLogger(HeroController.class);

    @RequestMapping("/getAllHero")
    public String getAllHero(Model model) {
        List<Hero> heros = heroService.getAllHero();
        System.out.println(heros);

        model.addAttribute("heros",heros);
        return null;
    }
}
