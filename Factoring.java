import java.util.*;
public class Factoring{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		long n = 2;
		while (n >= 2){
			System.out.print("Enter a number >=2: ");
			n = keyboard.nextLong();
			if ( n >= 2 )
			{
							factor(n);
			}
		}
	}

	public static void factor(long n){
		long theQuotient = n;
		long theDivisor = 2;
		while (theQuotient>1){
		
				if (theQuotient % theDivisor==0){
				    if (theQuotient == n){
						System.out.print(theDivisor);
					}else{
						System.out.print(" * " + theDivisor);
					}

				theQuotient = theQuotient/theDivisor;
				}
				else {
					theDivisor ++; 
				}

			}
			System.out.println();
		}








}