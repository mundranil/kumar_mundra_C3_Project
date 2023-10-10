import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) throws restaurantNotFoundException {

        LocalTime oTime = LocalTime.of(10, 0);
        LocalTime cTime = LocalTime.of(9, 0);
        Restaurant myRestaurant =  new Restaurant("Paradise", "Texas", oTime, cTime);
        RestaurantService restaurantService = new RestaurantService();
        System.out.println(myRestaurant.isRestaurantOpen());
        Restaurant temp;
        temp = restaurantService.findRestaurantByName("Paradise");
        System.out.println(temp.getName());


    }
}
