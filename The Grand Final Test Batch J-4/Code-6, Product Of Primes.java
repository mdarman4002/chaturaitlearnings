import java.util.*;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(productOfPrimes(a, b));
    }

    private static long productOfPrimes(int a, int b) {
        if (a > b) {
            return 1;
        }

        
        int limit = (int) Math.sqrt(b) + 1;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        
        boolean[] isPrimeRange = new boolean[b - a + 1];
        Arrays.fill(isPrimeRange, true);

        for (int prime : primes) {
            int start = Math.max(prime * prime, (a + prime - 1) / prime * prime);
            for (int j = start; j <= b; j += prime) {
                isPrimeRange[j - a] = false;
            }
        }

        
        long product = 1;
        for (int i = 0; i <= b - a; i++) {
            if (isPrimeRange[i] && (i + a) > 1) {
                product = (product * (i + a)) % MOD;
            }
        }

        return product;
    }
}
