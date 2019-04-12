package com.swierzowski.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {


    @Autowired
    String applicationName;
    @Autowired
    Double version;
    @Autowired
    Store store;
    @Autowired
    ItemDao itemDao;

    @Autowired
    ArrayList<String> listaStringow;

    public static void main(String[] args) {
        SpringApplication.run(Spring1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        /* // przyklady
        System.out.println("hello world");
        System.out.println(applicationName);
        store.getItems().forEach(System.out::println);
        Item item = itemDao.getItemByName("sdasdasdas");
        System.out.println(item);
         */

        // zadania

        listaStringow.forEach(System.out::println);


    }
}
