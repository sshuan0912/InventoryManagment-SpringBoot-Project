package OrderFulfillmentSystem.demo.Controller;

import OrderFulfillmentSystem.demo.Entity.Item;
import OrderFulfillmentSystem.demo.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping(path = "api/inventory")
public class ItemController {
    @Autowired
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/addItem")
    public Item addItem (@RequestBody Item item) {
        return itemService.saveItem(item);

    }

    @PostMapping("/addItems")
    public List<Item> addItems (@RequestBody List<Item> items) {
        return itemService.saveItems(items);
    }


    @GetMapping("/items")
    public List<Item> getAllItems(){
        return itemService.getItems();
    }

    @GetMapping("/itemById/{id}")
    public Item getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @GetMapping("/item/{name}")
    public Item getItemByName(@PathVariable String name){
        return itemService.getItemByName(name);
    }

    @PutMapping("/update")
    public Item updateItem(@RequestBody Item item){
        return itemService.updateItem(item);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id){
        return itemService.deleteItem(id);
    }

}
