@FunctionalInterface
interface Count{
    int Countdigits(int n);
}

class DigitsCount{
    static int digitcount(int n){
        if(n==1) return 1;
        int count = 0;
        while(n != 0){
            n = n / 10;     
            count++;
            }
        return count;
    }
}

public class DigitCount {
    public static void main(String args[]){
        Count c = DigitsCount::digitcount; 
        int result = c.Countdigits(111111);
        System.out.println("No of digits :  "+ result);
    }
}
