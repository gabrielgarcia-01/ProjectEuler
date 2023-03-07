class Euler12 {
	// Find the first triangle number to have over 500 divisors
	public static int numDivisors(int tNum) {
		int divCount = 0;
		int n = (int) Math.floor(Math.sqrt(tNum));
		// Only checking until the square root of the number
		// Since the divisors of a number can be represented in pairs such that
		// d(n) <= 2 sqrt(n) where d(n) represents the number of divisors
		for (int i = 1; i < n; i++) {
			if (tNum % i == 0) {
				divCount += 2;
			}
		}
		if (n * n == tNum) {
			// if the number is a perfect square then
			// d(n) <= 2 sqrt(n) + 1
			divCount++;
		}
		return divCount;
	}

	/*
	 * public static int tNum(int n){
	 * int tNum = 0;
	 * for(int i = 1; i < n; i++){
	 * tNum += i;
	 * }
	 * return tNum;
	 * }
	 */
	// Instead of having another method for this
	// I'll find the tNum as we loop through main
	// Since its rather slow elsewise
	public static void main(String[] args) {
		boolean nDivisors = false;
		int i = 2;
		int n = 500;
		int currentTNum = 1;
		while (!nDivisors) {
			currentTNum += i;
			if (numDivisors(currentTNum) > n) {
				nDivisors = true;
				System.out.println(currentTNum);
			}
			i++;
		}
	}
}
