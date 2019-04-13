package com.swierzowski.aspekty.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
@Component
public class Company {

    private String nazwa;
    private long liczbaPracownikow;
    private BigDecimal rocznyPrzychod;
    private String siedziba;

    public Company(String nazwa, long liczbaPracownikow, BigDecimal rocznyPrzychod, String siedziba) {
        this.nazwa = nazwa;
        this.liczbaPracownikow = liczbaPracownikow;
        this.rocznyPrzychod = rocznyPrzychod;
        this.siedziba = siedziba;
    }
}
