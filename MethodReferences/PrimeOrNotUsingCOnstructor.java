


@FunctionalInterface
interface PrimeChecker {
    PrimeClass check(int num); 
}


class PrimeClass {
    PrimeClass(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class PrimeOrNotUsingCOnstructor {
    public static void main(String[] args) {

        PrimeChecker checker = PrimeClass::new;

        checker.check(7);   
        checker.check(12);  
    }
}
