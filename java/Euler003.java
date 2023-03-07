//Find the largest prime factor for 600851475143
class Euler3 {
  public static boolean isPrime(long n) {
    for (int i = 2; i < n; i++) {
      /*
       * Originally had this looping until we reach sqrt(n) but this was a mistake on
       * my part, since it is likely that most prime factors
       * would be less than sqrt(n) [if we consider the prime factorization theorem
       * where n = p * q, and we also know that n is equal to its square root squared,
       * then if p < sqrt(n) then q would be implied to be >= to sqrt(n) e.g. 14 = 2 *
       * 7, since 7 is > sqrt(14), and my og solution would have ignored the larger
       * prime factor]
       */
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
  /*
   * public static long smallestFactor(long n){
   * long end = (long)Math.sqrt((double)n);
   * for(long i = 2; i <= end; i++){
   * if (n%i == 0) return i;
   * }
   * return n;// when n is prime
   * }
   */
  /*
   * for(long i = 0; i < (long)Math.sqrt((double)n); i++){
   * long prime = smallestFactor(n);
   * if(prime < n){
   * n /= prime;
   * }else{
   * System.out.println(Long.toString(n));
   * }
   * }
   */
  // 2/9/2023 refactored and commented out broken solution
  // It worked but ran on forever
}