import java.util.*;
public class duplicatecheck{
	public static int duplicateCheck(int[] array){
		int[] newarray = new int[array.length];
		for(int i = 0; i < array.length; i++){
			newarray[i] = array[i];
		}
		Arrays.sort(newarray);
	}
}