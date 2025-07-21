
@FunctionalInterface
interface FindFactorial{
    int compute(int n);
}

class Factorial{
    int findFact(int num){
        if(num<=1)
        return 1;
        else
        return num*findFact(num - 1);
    }
}
public class FindFact {
    public static void main(String args[]){
        Factorial fact = new Factorial();
        FindFactorial ref = fact::findFact;
        int result = ref.compute(5);
        System.out.println("Factorial is : "+ result);


    }
}
