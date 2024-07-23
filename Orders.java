import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // An object Orders has been defined with 4 attributes : id, product, quantity, countryId
        // You can find the corresponding country label of the countryId with the Map returned by getCountries() : countryId -> country label
        List<Orders> orders = getOrders();
        
        // 1) Display the country label of each order
        // The following output is expected : FR/CN/CN/IN/FR/FR/FR/CN
         
        // 2) I want the total ordered quantities per country. Then display it
        // Expected output : 
        // FR : 420.0
        // IN : 220.0
        // CN : 130.0
        Map<Integer,Double> quantitiesPerCountry = getQuantitiesPerCountry(orders);

    }

    public static int FR_ID = 1;
    public static int IN_ID = 2;
    public static int CN_ID = 3;
    public static int IT_ID = 6;

    public static Map<Integer, String> getCountries() {
        Map<Integer, String> countries = new HashMap<>();
        countries.put(FR_ID, "FR");
        countries.put(IN_ID, "IN");
        countries.put(CN_ID, "CN");
        countries.put(IT_ID, "IT");
        return countries;
    }
    
    public static Map<Integer,Double> getQuantitiesPerCountry(List<Orders> orders){
            // TODO : complete for Ex 2
            return new HashMap<Integer,Double>();
    }

    static class Orders {
        private final int id;
        private final int product;
        private final double quantity;
        private final int countryId;

        public Orders(int id, double quantity, int product, int countryId) {
            this.id = id;
            this.product = product;
            this.quantity = quantity;
            this.countryId = countryId;
        }

        public int getProduct() {
            return this.product;
        }

        public double getQuantity() {
            return this.quantity;
        }

        public int getCountryId() {
            return this.countryId;
        }
    }

    public static List<Orders> getOrders(){
        return new ArrayList<>(Arrays.asList(new Orders(1, 50d, 89991, 1), new Orders(2, 50d, 86552, 3), new Orders(3, 30d, 86590, 3),  new Orders(4, 220d, 81532, 2), new Orders(5, 300d, 99753, 1), new Orders(6, 100d, 99786, 10), new Orders(7, 20d, 89991, 1), new Orders(8, 50d, 81532, 1), new Orders(9, 50d, 81532, 3)));
    }

}