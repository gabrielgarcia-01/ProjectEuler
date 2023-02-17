import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.math.BigInteger;

class Eueler13 {
	public static String largeSumFirstTen(ArrayList<BigInteger> arr){
		BigInteger res = BigInteger.valueOf(0l);
		for(BigInteger b: arr){
			res = res.add(b);
		}
		return res.toString().substring(0,10);
	}

	/*public static void printList(ArrayList<BigInteger> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i).toString());
		}
	}*/// used this to make sure everything was working on file input

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("Euler13.txt"));
		ArrayList<BigInteger> bigList = new ArrayList<BigInteger>();
		String line = "";
		while((line = reader.readLine()) != null){
			BigInteger big = new BigInteger(line);
			bigList.add(big);
		}
		//printList(bigList);
		System.out.println(largeSumFirstTen(bigList));
	}
}