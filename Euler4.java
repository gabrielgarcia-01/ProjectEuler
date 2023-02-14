class Euler4 {
  //Find the largest palindrome made from the product of two 3 digit numbers
  public static boolean isPalindrome(String str){
    String backwards = "";//String to represent whatever number we are checking backwards
    boolean result = false;
 
    for (int i = str.length() - 1; i >= 0; i--) {
      backwards += str.charAt(i);
      // makes str backwards
    }
    if (str.equals(backwards)) {//if the backwards string == original string
      result = true;
    }
    return result;
  }
  public static int findLargestPalindrome(int n){
    int maxPalindrome = 0;
    for(int i = 100; i < n; i++){
      for(int j = 100; j < n; j++){
        int product = i*j;
        if(isPalindrome(Integer.toString(product)) && product > maxPalindrome){
          //Checks if n product of i and j is both a palindrome and greater than the last palindrome found
          maxPalindrome = product;
        }
      }
    }
    return maxPalindrome;
  }
  public static void main(String[] args) {
    System.out.println(findLargestPalindrome(1000));
  }
}