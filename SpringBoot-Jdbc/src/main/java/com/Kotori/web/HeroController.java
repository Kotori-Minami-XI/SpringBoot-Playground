package com.Kotori.web;

import com.Kotori.domain.Hero;
import com.Kotori.service.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HeroController {
    @Autowired
    private HeroService heroService;

    Logger log = LoggerFactory.getLogger(HeroController.class);

    @RequestMapping("/Hello")
    @ResponseBody
    public String Hello() {
        log.info("Hello----------------------------info");
        log.debug("Hello---------------------------debug");

        List<Hero> list = heroService.getAllHero();
        System.out.println(list);

        return "Hello";
    }

    @RequestMapping("/openHtml")
    public String openHtml(Model model) {
        model.addAttribute("name","Kotori");

        Hero hero = new Hero();
        hero.setId(1);
        hero.setEmail("123@qq.com");
        hero.setPhone("1231321321");
        model.addAttribute("hero",hero);


        model.addAttribute("HtmlContent","<h1>内联写法</h1>");

        return "myHello";
    }

    @RequestMapping("/getAllHero")
    public String getAllHero(Model model) {
        List<Hero> heros = heroService.getAllHero();
        System.out.println(heros);

        model.addAttribute("heros",heros);
        return "myHello2";
    }
}
