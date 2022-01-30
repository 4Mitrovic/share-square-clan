package com.kosmopolitika.sharesquareclan.bootstrap;

import com.kosmopolitika.sharesquareclan.model.Clan;
import com.kosmopolitika.sharesquareclan.model.ClanType;
import com.kosmopolitika.sharesquareclan.services.ClanService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClanService clanService;

    public DataLoader(ClanService clanService) {
        this.clanService = clanService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = clanService.findAll().size();

        if (count == 0 ){
            loadData();
        }
    }

    private void loadData() {

        Clan clan1 = new Clan();
        clan1.setFirstName("Jovan");
        clan1.setLastName("Jovanovic");
        clan1.setAddress("123 Brickerel");
        clan1.setCity("Beograd");
        clan1.setTelephone("1231231234");
        clan1.setClanType(ClanType.CLAN);
        clan1.setJoinDate(LocalDate.parse("2017-05-20"));
        clan1.setLastPayDate(LocalDate.now());

        clanService.save(clan1);

        Clan clan2 = new Clan();
        clan2.setFirstName("Marko");
        clan2.setLastName("Petrovic");
        clan2.setAddress("123 Brickerel");
        clan2.setCity("Uzice");
        clan2.setTelephone("1231231234");
        clan2.setClanType(ClanType.SARADNIK);
        clan2.setJoinDate(LocalDate.parse("2018-07-15"));
        clan2.setLastPayDate(LocalDate.now());

        clanService.save(clan2);

        Clan clan3 = new Clan();
        clan3.setFirstName("Ivan");
        clan3.setLastName("Jovanovic");
        clan3.setAddress("123 Brickerel");
        clan3.setCity("Subotica");
        clan3.setTelephone("1231231234");
        clan3.setClanType(ClanType.PRETPLATNIK);
        clan3.setJoinDate(LocalDate.parse("2021-09-20"));
        clan3.setLastPayDate(LocalDate.parse("2022-01-10"));

        clanService.save(clan3);

        System.out.println("Loaded Clans....");
    }
}
