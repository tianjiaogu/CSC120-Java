import java.util.*;
import java.io.*;
public class NumeralCount
{
	public static void main (String[] args) throws FileNotFoundException{
		File f = new File (args[0]);
		Scanner fs = new Scanner (f);
		int[] countA = new int[10];
		while(fs.hasNextLine()){
			String input  = fs.nextLine();
			for(int k = 0; k < input.length(); k++){
			int num = (int)input.charAt(k);
			for(int i = 0; i < 10; i ++){
				if(num == i){
					countA[i]++;
				}
			}
		}
		}
		for(int j = 0; j < 10; j++){
			System.out.println(countA[j]);
		}
	}
}