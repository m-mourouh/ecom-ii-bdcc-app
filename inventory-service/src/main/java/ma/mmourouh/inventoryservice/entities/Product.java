package ma.mmourouh.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder @ToString
public class Product {
    @Id @GeneratedValue
    private String id;
    private String name;
    private double price;
    private int quantity;
}
