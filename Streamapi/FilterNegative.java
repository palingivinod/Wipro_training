import java.util.*;
import java.util.stream.Collectors;


public class FilterNegative {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-20);
        numbers.add(30);
        numbers.add(-40);
        numbers.add(50);
  
        List<Integer> positivenumbers = numbers.stream()
                                        .filter(n->n>=0)
                                        .collect(Collectors.toList());
        
        System.out.println(positivenumbers);

    }
}
