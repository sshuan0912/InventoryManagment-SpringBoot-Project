package OrderFulfillmentSystem.demo.Repository;

import OrderFulfillmentSystem.demo.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByName(String name);
}
