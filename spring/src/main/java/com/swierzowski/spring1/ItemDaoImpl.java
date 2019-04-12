package com.swierzowski.spring1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mysql")
//@Primary
public class ItemDaoImpl implements  ItemDao{


    @Override
    public Item getItemByName(String itemName) {
        return null;
    }
}
