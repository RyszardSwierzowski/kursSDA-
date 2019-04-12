package com.swierzowski.spring1;

import java.util.List;

public class Store {
    List<Item> items;

    public Store() {
    }

    public Store(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Store{" +
                "items=" + items +
                '}';
    }
}
