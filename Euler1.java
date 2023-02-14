//Find the sum of all the multiples of 3 or 5 under 1000

class Euler1 {
  public static void main(String[] args) {
    int result = 0;
    for(int i = 0; i<1000; i++){//Loop through to 1000 
      result += findMultiples3or5(i);
    }
    System.out.println(result);
  }
  public static int findMultiples3or5(int i){
    int sum = 0;
    if(i%5 == 0 || i%3 == 0) sum+=i;//finds if is multiple of 3 or 5
    return sum;
  }
}