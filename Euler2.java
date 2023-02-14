class Euler2 {
  
  public static int fibonacci(int n) {//recursive method for finding the nth fibonacci sequence;
    if(n == 0 || n ==1) return n;
    return fibonacci(n-1) + fibonacci(n-2);
  }
  
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    int sum = 0;
    int currentFibonacci = fibonacci(0);
    for(int i = 0; currentFibonacci < 3500000; i++){
      //loop through i number of fibonnacci terms until           the current fibonacci reaches 3.5 million
      currentFibonacci = fibonacci(i);
      if(currentFibonacci%2 == 0){
        sum += currentFibonacci;//sum += any even fibonacci term under 3.5 million
      }
    }
    long endTime = System.currentTimeMillis();
    double runTime = (double)(endTime - startTime) / 1000.0;//for benchmarking bc its recursive
    System.out.println(sum + " run time: " + runTime);
  }
}