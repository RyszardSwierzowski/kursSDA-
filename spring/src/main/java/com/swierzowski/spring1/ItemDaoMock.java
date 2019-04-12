package com.swierzowski.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("mock")
public class ItemDaoMock implements ItemDao {

    @Autowired
    Item snickers;


    @Override
    public Item getItemByName(String itemName) {
        return snickers;
    }
}
