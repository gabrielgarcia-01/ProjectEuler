class Euler10{
	//Find the sum of all primes

	//method will find all primes < n
	static int sieveOfEratosthenes(int n){
		//boolean array prim[0, n-1] will let us know which value are prime
		boolean prime[] = new boolean[n-1];
		int sum = 0;
		for(int i = 0; i < n; i++) prime[i] = true;//intialize all numbers from 0 to n-1 as prime
		for(int j = 2; j*j < n; j++){//starts at 2 since 2 is first prime #
			if(prime[j] == true){// 
				for(int i = j*j; i < n; i += j){
				//finds all multiples of j greater than or equal to j*j and 
				//marks them as false
					prime[i] = false;			
				}
			}
		}
		for(int i = 2; i < n; i++){
			if(prime[i] ==  true){
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println("The sum of all primes below 2 million is " + sieveOfEratosthenes(2000000));
	}
