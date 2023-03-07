import java.util.Arrays;

public class Euler10 {
    public static boolean[] sieveOfEratosthenes(int n) {
        // Creates a boolean array of size n and fills it with true
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        primes[0] = false; // 0 and 1 are both not prime
        primes[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(primes[i]) {
                for (int j = i*i; j < n; j+=i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        int sum = 0;
        int n = 2000000;
        boolean[] primes = sieveOfEratosthenes(n);
        for(int i = 2; i < n; i++) {
            if(primes[i]) sum += i;
        }
        System.out.println(sum);
    }
}
