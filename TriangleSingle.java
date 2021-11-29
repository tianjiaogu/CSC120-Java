import java.util.*;
public class TriangleSingle
{   
    public static int generate( int num ){
        int maxTemp;
        maxTemp = (int)(Math.sqrt(1+4*2*num)-1)/2;
        return maxTemp;
    }

    public static void main ( String[] args){

    	Scanner keyboard = new Scanner ( System. in); 
    	System.out.print("Enter the number:");
        int num = keyboard.nextInt();
        int maxLen = generate(num);
        for (int i = 1; i <= maxLen; i++ ){
    		for (int k=1; k <= i; k++){
    			System.out.print("*");
    		}
    		       System.out.printf("\n");


    	}
    }

}

