package domain;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop {
    private final Map<String,Item> inventory= new HashMap<String,Item>();
    public void addItem(Item item){
        inventory.put(item.getName(),item);
    }
    public Item getItem(String name){
        return inventory.get(name);
    }

}
