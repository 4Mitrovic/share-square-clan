package com.kosmopolitika.sharesquareclan.services.springdatajpa;

import com.kosmopolitika.sharesquareclan.model.Clan;
import com.kosmopolitika.sharesquareclan.repositories.ClanRepository;
import com.kosmopolitika.sharesquareclan.services.ClanService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class ClanSDJpaService implements ClanService {

    private final ClanRepository clanRepository;

    public ClanSDJpaService(ClanRepository clanRepository) {
        this.clanRepository = clanRepository;
    }

    @Override
    public Clan findByLastName(String lastName) {
        return clanRepository.findByLastName(lastName);
    }

    @Override
    public List<Clan> findAllByLastNameLike(String lastName) {
        return clanRepository.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Clan> findAll() {
        Set<Clan> clans = new HashSet<>();
        clanRepository.findAll().forEach(clans::add);
        return clans;
    }

    @Override
    public Clan findById(Long aLong) {
        return clanRepository.findById(aLong).orElse(null);
    }

    @Override
    public Clan save(Clan object) {
        return clanRepository.save(object);
    }

    @Override
    public void delete(Clan object) {
        clanRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clanRepository.deleteById(aLong);
    }
}