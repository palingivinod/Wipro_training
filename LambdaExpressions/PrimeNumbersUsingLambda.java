
import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbersUsingLambda {
    public boolean isPrime(int num ){
        if(num<=1)
        return false;
        else{
            for(int i = 2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        PrimeNumbersUsingLambda obj = new PrimeNumbersUsingLambda();
        ArrayList<Integer> a1 = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i< 25;i++){
            a1.add(rand.nextInt(100));
        }
        System.out.println(a1);
        a1.forEach(x -> {
            if(obj.isPrime(x)){
                System.out.println(x);
            }
        });
    }
}
