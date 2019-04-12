package com.swierzowski.spring1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfig {

    @Bean
    String applicationName(){
        return "moja aplikacja";
    }
    @Bean
    Double version(){
        return 0.1;
    }
    @Bean
    Item snickers(){
        Item item = new Item();
        item.setCena(10);
        item.setNazwa("Snickers");
        item.setOpis("czekoladowy");
        return  item;
    }
    @Bean
    Item cola(){
        Item item = new Item();
        item.setCena(5);
        item.setNazwa("Cola");
        item.setOpis("cola jak cola");
        return  item;
    }
    @Bean
    Store sklep(){
        Store store = new Store();
        List<Item> items= new ArrayList<>();
        items.add(cola());
        items.add(snickers());
        store.setItems(items);
        return store;
    }

    // package zadania
    @Bean
    ArrayList<String> strings(){

        ArrayList<String> list = new ArrayList<>();
        list.add("dasdavz");
        list.add("abcb");
        list.add("qwe");
        list.add("cvcx");
        list.add("dabcb");

        return list;
    }

}
