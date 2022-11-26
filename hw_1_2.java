import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw_1_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(func(1000).toArray()));
    }

    public static List<Integer> func(int max) {
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < max; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < max; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
    
}
