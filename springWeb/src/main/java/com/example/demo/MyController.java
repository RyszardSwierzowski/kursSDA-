package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/sciezkaDoWidoku")
    String pokazWidok(){
        return "widok";
    }
    @GetMapping("/wiadomosc")
    String wiadomosc(Model model){

        model.addAttribute("message", "cokolwiek");

        return "msgWidok";
    }

    @GetMapping("/wiadomosc/{tresc}")
    String wiadomoscZmienna(Model model,
                            @PathVariable("tresc") String s,
                            @RequestParam("imie") String i   ){

        model.addAttribute("message", s);
        model.addAttribute("parametr", i);

        return "msgWidok";
    }

    @GetMapping("/formularz")
    String zaloguj(){
        return "formularz";
    }

    @PostMapping("/wynik")
    String wynikLogowania(@RequestParam("imie") String i,
                          @RequestParam("nazwisko") String n,
                          Model model){
        model.addAttribute("nazwisko",n);
        return "wynik";
    }

    // formularz z auto towrzeniem obiektu z formularza
    @GetMapping("/dodaj")
    String dodaj(Model model){

        model.addAttribute("user", new User());

        return "dodajUzytkownika";
    }

    @PostMapping("/zatwierdz")
    String submit(@ModelAttribute("user") User u, Model model){
        Long id = u.getId();
        model.addAttribute("id",id);

//        model.addAttribute("user", u);
        return "widokWynikowy";

    }

}
