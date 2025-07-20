package Maps;

import java.util.*;

public class ContactList {
    HashMap<String, Integer> contacts;

    public ContactList() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public boolean isNameExist(String name) {
        for (String key : contacts.keySet()) {
            if (key.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPhoneExist(Integer number) {
        return contacts.containsValue(number);
    }

    public void displayContacts() {
        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.addContact("Vinnu", 987654321);
        contactList.addContact("Abde", 912345678);
        contactList.addContact("Chinnu", 998877665);
        // Checking for the key
        System.out.println("Is 'Vinnu' in contacts? " + contactList.isNameExist("Vinnu"));
        // Check for the value
        System.out.println("Is number 912345678 present? " + contactList.isPhoneExist(912345679));

        contactList.displayContacts();
    }
}
