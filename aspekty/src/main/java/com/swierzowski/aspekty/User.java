package com.swierzowski.aspekty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String imie;
    private String pesel;

    public User(String imie, String pesel) {
        this.imie = imie;
        this.pesel = pesel;
    }
}
