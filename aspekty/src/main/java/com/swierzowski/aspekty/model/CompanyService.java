package com.swierzowski.aspekty.model;


import com.swierzowski.aspekty.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CompanyService {
    private Company myCompany = new Company("Wioch-Med", 79L, new BigDecimal(5646589.89), "Rzeszów");


    public void setUpperSiedziba(String newName){
        myCompany.setSiedziba( newName.toUpperCase() );
    }
}
