import java.util.*;
 public class ArrayListCreation {
     public static void main(String[] args) {
         ArrayList<String> stringList = new ArrayList<>();
         stringList.add("January");
         stringList.add("February");
         stringList.add("March");
         stringList.add("April");
         stringList.add("May");
         stringList.add("June");
         stringList.add("July");
         stringList.add("August");
         stringList.add("September");
         stringList.add("October");
         stringList.add("November");
         stringList.add("December");
        
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());   
  
     }
 }
}