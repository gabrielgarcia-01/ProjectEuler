import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
//Find the largest product of four adjacent digits in a 1000 digit number

class Euler8{
	public static long productOfAdjacents(String str){
	//Method to find the product of adjacent characters in string 
		long product = 1;
		for(int i = 0; i<str.length(); i++){
			int a = Character.getNumericValue(str.charAt(i));
			product = product * (long)a;
		}
		return product;
	}
	static long maxProductFromString(String str, int adj){
		//Method to find the largest product of adj adjacent characters in a string
		long maxProduct = 1L;

		for(int i = 0; i < str.length() - adj; i++){
			long temp = productOfAdjacents(str.substring(i,i+adj));
			//finds product of each character in a substring 13 characters long
			if(temp > maxProduct){
				maxProduct = temp;
			} 
		}
		return maxProduct; 
	}
	public static void main(String[] args){
		String line = "";
		StringBuilder file = new StringBuilder();
		try{
			BufferedReader reader = new BufferedReader(new FileReader("Euler8.txt"));
			while((line = reader.readLine()) != null){
				//Reads from file until we reach last line (null)
				//And appends line to StringBuilder file
				file.append(line);
			}
			reader.close();//Close the reader or funky stuff can happen
		} catch(IOException e){
			e.printStackTrace();
		}
		String result = file.toString().replaceAll("\\s", "");
		System.out.println(maxProductFromString(result, 13));
	}
}
