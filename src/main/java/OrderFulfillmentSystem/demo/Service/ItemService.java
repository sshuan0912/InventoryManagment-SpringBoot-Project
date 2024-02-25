package OrderFulfillmentSystem.demo.Service;

import OrderFulfillmentSystem.demo.Entity.Item;
import OrderFulfillmentSystem.demo.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public Item saveItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> saveItems(List<Item> items){
        return itemRepository.saveAll(items);
    }

    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    public Item getItemById(long id){
        return itemRepository.findById(id).orElse(null);
    }

    public Item getItemByName(String name){
        return itemRepository.findByName(name);
    }

    public String deleteItem(long id){
        itemRepository.deleteById(id);
        return "item removed!!" + id;
    }

    public Item updateItem(Item item){
        Item existingItem = itemRepository.findById(item.getId()).orElse(null);
        existingItem.setName(item.getName());
        existingItem.setQuantity(item.getQuantity());
        existingItem.setDescription(item.getDescription());
        existingItem.setUpdatedAt(Timestamp.from(Instant.now()));
        return itemRepository.save(existingItem);
    }

}
