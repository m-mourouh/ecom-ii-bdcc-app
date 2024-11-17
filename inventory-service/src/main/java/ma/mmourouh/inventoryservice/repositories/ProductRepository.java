package ma.mmourouh.inventoryservice.repositories;

import ma.mmourouh.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
