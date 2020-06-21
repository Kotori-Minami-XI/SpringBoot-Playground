package com.Kotori.service;

import com.Kotori.domain.Hero;

import java.util.List;

public interface HeroService {
    public List<Hero> getAllHero();

    void insertHero(Hero hero);
}
