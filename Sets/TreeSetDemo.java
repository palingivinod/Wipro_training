import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet to store String objects
        TreeSet<String> treeSet = new TreeSet<>();
        
        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Fig");
        
        System.out.println("Original TreeSet: " + treeSet);
        
        // a) Reverse the elements of the Collection
        System.out.println("\nReversed TreeSet:");
        TreeSet<String> reversedSet = new TreeSet<>(Collections.reverseOrder());
        reversedSet.addAll(treeSet);
        System.out.println(reversedSet);
        
        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("\nIterating through TreeSet:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // c) Check if a particular element exists or not
        String searchElement = "Cherry";
        System.out.println("\nChecking if '" + searchElement + "' exists:");
        if (treeSet.contains(searchElement)) {
            System.out.println("'" + searchElement + "' exists in the TreeSet");
        } else {
            System.out.println("'" + searchElement + "' does not exist in the TreeSet");
        }
        
    }
}