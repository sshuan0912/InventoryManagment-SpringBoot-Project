package OrderFulfillmentSystem.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name="items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "description")
    private String description;
    @Column(name = "createdAt")
    @CreationTimestamp
    private Timestamp createdAt;
    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Timestamp updatedAt;

//    public Item(String name, Integer quantity, String description, Timestamp createdAt, Timestamp updatedAt) {
//        this.name = name;
//        this.quantity = quantity;
//        this.description = description;
//        this.createdAt = Timestamp.from(Instant.now());
//        this.updatedAt = Timestamp.from(Instant.now());
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
