//Find all multiples of 3 or 5 under 1000

class Euler1 {
  public static void main(String[] args) {
    int n = 1_000;
    int sum = 0;
    for(int i = 0; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
