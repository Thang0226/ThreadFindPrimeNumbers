public class OptimizedPrimeFactorization implements Runnable {
	@Override
	public void run() {
		int count = 0;
		int number = 0;
		int numberOfNumbers = 200;

		while (count < numberOfNumbers) {
			if (isPrime(number)) {
				count++;
				System.out.println("Optimized thread: " + count + "th prime number: " + number);
			}
			number++;
		}
	}

	private boolean isPrime(int number) {
		if (number <= 9) {
			return number >= 2 && number != 4 && number != 6 && number != 8 && number != 9;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
