package com.swierzowski.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository                                           //<Encja  ,typIDzEncji>
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findProductByName(String name);
    @Query("select p from Product p where p.name=:mojaNazwa")
    List<Product> fetchAllByName(@Param("mojaNazwa")String name);

}
