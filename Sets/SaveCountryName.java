import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SaveCountryName {

    private HashSet<String> H1;

    public SaveCountryName() {
        H1 = new HashSet<>();
    }

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equalsIgnoreCase(countryName)) {
                return current;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SaveCountryName Country = new SaveCountryName();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do? 1. Search  2. Add country");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter country name to search:");
                String searchCountry = sc.nextLine();
                String searchresult = Country.getCountry(searchCountry);
                if (searchresult != null) {
                    System.out.println("Country found: " + searchresult);
                } else {
                    System.out.println("Country not found: null");
                }
            } else if (choice == 2) {
                System.out.println("Enter country names (type 'exit' to stop):");
                while (true) {
                    String countryname = sc.nextLine();
                    if (countryname.equalsIgnoreCase("exit")) {
                        break;
                    } else {
                        Country.saveCountryNames(countryname);
                    }
                }
            }

            System.out.println("Do you want to continue? (yes/no)");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
        sc.close();
    }
}
