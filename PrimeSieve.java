public class PrimeSieve {
    public static void main(String[] args) {
        int n = 10; // Upper limit of range
        // Boolean array to mark prime numbers
        boolean[] isPrime = new boolean[n + 1];
        // Initially, mark all numbers as prime
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        // 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;
        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Marking multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // Printing prime numbers in the range
        System.out.println("Prime numbers in range 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}