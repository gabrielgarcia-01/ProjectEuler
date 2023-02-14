class Euler6 {
  //Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
  public static int sumOfSquares(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum += (i*i);
    }
    return sum;
  }
  public static int squareOfSums(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum+=i;
    }
    return sum*sum;
  }
  public static void main(String[] args) {
    int diff = squareOfSums(100) - sumOfSquares(100);
    System.out.println(diff);
  }
}