import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<Item> items;

    public ShoppingBasket() {
        items = new ArrayList<>();
    }

    public int getTotal() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public String displayItems() {
        if(items.size() > 0) {
            return items.toString();
        } else {
            return "Empty basket";
        }
    }

    @Override
    public String toString() {
        return items.toString();
    }
}

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
