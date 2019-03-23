package pl.swierzowski.dao;

import pl.swierzowski.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> findAll();
    void create(Product post);
    void edit(Product post);
    void remove(Product product);
}
