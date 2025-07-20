package Maps;
import java.util.*;
public class FindKeyValue {
    HashMap<String, String> data;

    public FindKeyValue() {
        data = new HashMap<>();
    }

    public HashMap<String, String> addValues(String key, String value) {
        data.put(key, value);
        return data;
    }

    // Check if a value exists in the map
    public boolean isValueExist(String key) {
        return data.containsKey(key);
    }
    // Check if a key exists in the map
    public String isKeyExist(String value) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        FindKeyValue obj = new FindKeyValue();

        obj.addValues("India", "Delhi");
        obj.addValues("Japan", "Tokyo");

        System.out.println("Is key 'India' present? " + obj.isValueExist("India"));
        System.out.println("Is value 'Tokyo' mapped to any key? -> " + obj.isKeyExist("Tokyo"));
        
        Set<Map.Entry<String, String>> entry = obj.data.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> current = iterator.next();
            System.out.println("Key: " + current.getKey() + ", Value: " + current.getValue());
        }
    }
}
