//Find the largest prime factor for 600851475143
class Euler3 {
  public static boolean isPrime(long n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    long n = 600851475143L;
    long largestFactor = 1;
    long res = 1;
    while (res * res < n) {
      if (n % res == 0 && res > largestFactor && isPrime(res)) {
        largestFactor = res;
      }
      res++;
    }

    System.out.println(Long.toString(largestFactor));
  }
}
