package Maps;
import java.util.*;

public class StateCapitalProperties {
    public static void main(String[] args) {
 
        Properties statesAndCapitals = new Properties();

        statesAndCapitals.setProperty("Andhra Pradesh", "Amaravati");
        statesAndCapitals.setProperty("Telangana", "Hyderabad");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");
        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Tamil Nadu", "Chennai");

        Set<Map.Entry<Object, Object>> entrySet = statesAndCapitals.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        System.out.println("List of States and their Capitals:");
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
