package com.kosmopolitika.sharesquareclan.repositories;

import com.kosmopolitika.sharesquareclan.model.Clan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClanRepository extends CrudRepository<Clan, Long> {

    Clan findByLastName(String lastName);

    List<Clan> findAllByLastNameLike(String lastName);
}
