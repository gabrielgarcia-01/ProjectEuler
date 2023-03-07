public class Euler9{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 1000;
		// 0 = 500000 - 1000(a+b) + ab when a < b < c
		// Used basic algebra to make a^2 + b^2 = (1000 - (a+b))^2
		// then solved for it
		for(int i = 1; i < 1000; i++){//Loop through natural numbers under 1000
			for(int j = 2; j < 1000; j++){
				if((i < j && j < c) && (500000 - 1000*(i+j) + i*j) == 0){
				// if 1 <= i < j < c && conditions are met for pythagorean triplet = 1000
					a = i;
					b = j;
				}
			}
		}
		c = 1000 - a - b;
		System.out.println("a: "+  a + " b: " + b + " c: " + c);
		System.out.println(a*b*c);

	}
}