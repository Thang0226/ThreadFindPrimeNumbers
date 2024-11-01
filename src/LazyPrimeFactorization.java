public class LazyPrimeFactorization implements Runnable {
	@Override
	public void run() {
		int count = 0;
		int number = 0;
		int numberOfNumbers = 200;

		while (count < numberOfNumbers) {
			if (isPrime(number)) {
				count++;
				System.out.println("Lazy thread: " + count + "th prime number: " + number);
			}
			number++;
		}
	}

	private boolean isPrime(int number) {
		if (number < 2) return false;
		if (number < 4) return true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
