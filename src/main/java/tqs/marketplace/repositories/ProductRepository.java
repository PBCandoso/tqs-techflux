package tqs.marketplace.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import tqs.marketplace.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByNameContaining(String partialName);
    Product findById(long id);

    //List<Product> findByTag(String tag);

}
