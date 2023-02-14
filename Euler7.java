class Euler7 {

  public static boolean isPrime(int n){
    for(int i = 2; i < n; i++){
      if(n%i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    int nthPrime = 0;
    int prime = 0;
    for(int n = 2; prime < 10001; n++){
      if(isPrime(n)){
        prime++;
        nthPrime = n;
      }
    }
    long endTime = System.currentTimeMillis();
    double runTime = (double)(endTime - startTime)/1000
    System.out.print(nthPrime + " run time: " + runTime);
  }
}