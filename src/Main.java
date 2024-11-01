public class Main {
	public static void main(String[] args) {
		LazyPrimeFactorization finder1 = new LazyPrimeFactorization();
		OptimizedPrimeFactorization finder2 = new OptimizedPrimeFactorization();
		Thread t1 = new Thread(finder1);
		Thread t2 = new Thread(finder2);
		t1.start();
		t2.start();
		// When optimized thread printed 200th prime number, lazy thread had only printed 90 ~ 120 prime numbers.
	}
}
