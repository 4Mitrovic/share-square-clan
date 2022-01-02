package com.kosmopolitika.sharesquareclan.bootstrap;

import com.kosmopolitika.sharesquareclan.model.Clan;
import com.kosmopolitika.sharesquareclan.services.ClanService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        clanService.save(clan1);

        Clan clan2 = new Clan();
        clan2.setFirstName("Marko");
        clan2.setLastName("Petrovic");
        clan2.setAddress("123 Brickerel");
        clan2.setCity("Uzice");
        clan2.setTelephone("1231231234");

        clanService.save(clan2);

        Clan clan3 = new Clan();
        clan3.setFirstName("Ivan");
        clan3.setLastName("Jovanovic");
        clan3.setAddress("123 Brickerel");
        clan3.setCity("Subotica");
        clan3.setTelephone("1231231234");

        clanService.save(clan3);

        System.out.println("Loaded Clans....");
    }
}
