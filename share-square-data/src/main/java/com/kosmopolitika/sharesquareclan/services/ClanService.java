package com.kosmopolitika.sharesquareclan.services;

import com.kosmopolitika.sharesquareclan.model.Clan;

import java.util.List;

public interface ClanService  extends CrudService<Clan, Long> {

    Clan findByLastName(String lastName);

    List<Clan> findAllByLastNameLike(String lastName);
}
