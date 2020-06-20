package com.Kotori.service;

import com.Kotori.domain.Hero;
import com.Kotori.mapper.HeroMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {
    @Resource
    private HeroMapper heroMapper;

    public List<Hero> getAllHero() {
        return heroMapper.getAllHero();
    }
}
