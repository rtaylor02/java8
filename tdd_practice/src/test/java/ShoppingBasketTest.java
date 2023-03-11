import org.junit.Before;
import org.junit.Test;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    private ShoppingBasket shoppingBasket;

    @Before
    public void setup() {
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void totalofEmptyBasket() {
        assertEquals(0, shoppingBasket.getTotal());
    }

    @Test
    public void totalOfOneItem() {
        shoppingBasket.add(new Item("yogurt"));

        assertEquals(1, shoppingBasket.getTotal());
    }

    @Test
    public void totalOfThreeItems() {
        shoppingBasket.add(new Item("pizza"));
        shoppingBasket.add(new Item("tiramisu"));
        shoppingBasket.add(new Item("shampoo"));

        assertEquals(3, shoppingBasket.getTotal());
    }

    @Test
    public void displayEmptyShoppingBasket() {
        assertEquals("Empty basket", shoppingBasket.displayItems());
    }

    @Test
    public void displayShoppingBasketWithOneItem() {
        shoppingBasket.add(new Item("yogurt"));

        assertEquals("[yogurt]", shoppingBasket.displayItems());
    }

    @Test
    public void displayShoppingBasketWithTwoItems() {
        shoppingBasket.add(new Item("yogurt"));
        shoppingBasket.add(new Item("tiramisu"));

        assertEquals("[yogurt, tiramisu]", shoppingBasket.displayItems());
    }
}
