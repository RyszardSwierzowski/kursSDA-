package com.swierzowski.aspekty;

import com.swierzowski.aspekty.annotation.Aspectable;
import com.swierzowski.aspekty.model.Company;
import com.swierzowski.aspekty.model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspektyApplication  implements CommandLineRunner {

    @Autowired
    UserService userService;
    @Autowired
    CompanyService companyService;
    @Autowired
    Company company;




    public static void main(String[] args) {
        SpringApplication.run(AspektyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // wstep
//        userService.getUpperName();
//        userService.error();

        //zad 1
//        companyService.setUpperSiedziba("Krakow");
//        company.setSiedziba("Warszawa");
//        company.getSiedziba();
        //zad3






    }
}
