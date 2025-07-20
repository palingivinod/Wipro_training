package Maps;
import java.util.*;

public class CountryCapital {

    private HashMap<String, String> M1 = new HashMap<>();

    // Method to save Country and Capital into the map
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Method to get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Method to get country by capital name (need to iterate the map)
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null; 
    }

    // Create another map M2 with capital as key and country as value
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // Get all country names (keys) into an ArrayList
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapital cc = new CountryCapital();

        cc.saveCountryCapital("India", "Delhi");
        cc.saveCountryCapital("Japan", "Tokyo");

     
        System.out.println("Capital of India: " + cc.getCapital("India"));

    
        System.out.println("Country with capital Tokyo: " + cc.getCountry("Tokyo"));

        HashMap<String, String> M2 = cc.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + M2);

        ArrayList<String> countryList = cc.getAllCountries();
        System.out.println("All countries: " + countryList);
    }
}
