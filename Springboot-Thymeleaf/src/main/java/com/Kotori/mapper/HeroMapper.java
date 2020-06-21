package com.Kotori.mapper;

import com.Kotori.domain.Hero;

import java.util.List;

public interface HeroMapper {
    public List<Hero> getAllHero();

    void insertHero(Hero hero);
}
