    
import java.util.ArrayList;
import java.util.Collections;

public class OddLengthWords {
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Grape");
        words.forEach(x->{
            if(x.length()%2!=0){
                System.out.println(x);
            }
        });
    }

}

