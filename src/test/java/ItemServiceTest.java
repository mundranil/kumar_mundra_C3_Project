import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
public class ItemServiceTest {
    private  ItemService service = new ItemService();
    private  Restaurant restaurant;


    @BeforeEach
    public  void setup() throws restaurantNotFoundException {

        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
    }

    @Test
    public void calculate_menu_total_order_should_return_all_items_total_order_value() throws itemNotFoundException {
        List<String> menuItems = Arrays.asList("Sweet corn soup", "Vegetable lasagne");
        int orderTotal = service.displayTotalOrder(menuItems);
        assertEquals(388, orderTotal);
    }

    @Test
    public void calculate_menu_total_order_should_throw_exception_if_item_not_in_the_list() throws itemNotFoundException {
        List<String> menuItems = Arrays.asList("Sweet corn soup", "Unknown Item");
        assertThrows(itemNotFoundException.class,()->service.displayTotalOrder(menuItems));
    }

}
