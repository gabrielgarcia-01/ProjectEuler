class Euler5 {
  public static int findSmallestDivisibleBy20(){
    //Find smallest positive number that is evenly divisible by all the numbers from 1 to 20

    int s = 2520; 
    //Will represent the smallest posible #, starting at 2520 since that number is the smallest divisible by 1 through 10

    for(int i = 2; i <= 20; i++){//loop from 2 to 20 until we meet exit case
      if(!(s%i == 0)){            
        i = 2;                
        s++;                  
        /*If s is not divisible by any number between 2 and 20 evenly
          then we reset i to the base divisor (2) and increase s (number we are looking for)
          until a number is found that meets the exit condition*/
      }
    }
    return s;
  }
  public static void main(String[] args){
    System.out.println(findSmallestDivisibleBy20());
  }
}
