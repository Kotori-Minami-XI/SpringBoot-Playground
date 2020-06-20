package com.Kotori.mapper;

import com.Kotori.domain.Hero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface HeroMapper {
    public List<Hero> getAllHero();
}
