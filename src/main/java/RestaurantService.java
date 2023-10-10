import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    // for code execution purpose added Restaurant object

//    static {
//        LocalTime oTime = LocalTime.of(10, 0);
//        LocalTime cTime = LocalTime.of(22, 0);
//        restaurants.add(new Restaurant("Paradise", "Texas", oTime, cTime));
//    }

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        for (Restaurant restaurant : restaurants) {
            if(restaurant.getName().equalsIgnoreCase(restaurantName)) {
                return  restaurant;
            }
        }

        throw new restaurantNotFoundException("Hotel not found: " + restaurantName);
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
