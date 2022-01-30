package com.kosmopolitika.sharesquareclan.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Clan extends Person{

    @Builder
    public Clan(Long id, String firstName, String lastName, String address, String city,
                 String telephone) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ClanType clanType;

    @Column(name = "joinDate")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate joinDate;

    @Column(name = "lastPayDate")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate lastPayDate;

}