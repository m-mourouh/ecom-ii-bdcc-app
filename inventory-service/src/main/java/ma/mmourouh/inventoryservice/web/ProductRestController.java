package ma.mmourouh.inventoryservice.web;

import ma.mmourouh.inventoryservice.entities.Product;
import ma.mmourouh.inventoryservice.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductRepository productRepository;
    public ProductRestController(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product> productList(){

        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product productList(@PathVariable String id){

        return productRepository.findById(id).get();
    }
}
