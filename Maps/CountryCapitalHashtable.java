package Maps;

import java.util.*;

public class CountryCapitalHashtable {
    Hashtable<String, String> M1 = new Hashtable<>();

    public Map<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Map<String, String> reverseMap() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapitalHashtable obj = new CountryCapitalHashtable();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.reverseMap());
        System.out.println(obj.getAllCountries());
    }
}
