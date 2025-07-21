
interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    
    public static void display(String input, WordCount wc) {
        int wordCount = wc.count(input);
        System.out.println("Input: " + input);
        System.out.println("Total number of words: " + wordCount);
    }

    public static void main(String[] args) {
    
        WordCount wc = (String str) -> str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;

        String input = "Learning from Wipro training";

        display(input, wc);
    }
}
