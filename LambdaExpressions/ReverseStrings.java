
import java.util.ArrayList;
import java.util.Collections;

public class ReverseStrings {
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Grapes");
        words.add("Honeydew");
        words.add("Mango");
        words.add("Orange");
        words.add("Guava");
        words.add("Custardapple");\
        Collections.reverse(words);
        words.forEach(x->System.out.println(x));
    }

}
