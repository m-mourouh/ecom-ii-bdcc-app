package ma.mmourouh.inventoryservice;

import ma.mmourouh.inventoryservice.entities.Product;
import ma.mmourouh.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product
                    .builder().id(UUID.randomUUID().toString()).name("SMART_VR").price(12000).quantity(10)
                    .build());
            productRepository.save(Product
                    .builder().id(UUID.randomUUID().toString()).name("DISQUE_DURE").price(2000).quantity(30)
                    .build());
            productRepository.save(Product
                    .builder().id(UUID.randomUUID().toString()).name("SmartPhone").price(18000).quantity(20)
                    .build());
        };
    }

}
