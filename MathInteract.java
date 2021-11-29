import java.util.*;
public class MathInteract{
	public static void main(String[] args){

		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter two real numbers :");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		System.out.println(a,b);
		
		int d = 1;
		
		while(d >= 1){
			String c = keyboard.next();

			System.out.println("Enter operation :" + c);
		

			switch(c){
				case "+": System.out.printf("%.8f",a+b);break;
				case "-": System.out.printf("%.8f",a-b);break;
				case "*": System.out.printf("%.8f",a*b);break;
				case "/": System.out.printf("%.8f",a/b);break;
				case "%": System.out.printf("%.8f",a%b);break;
				default: break;

			}
			d=d+1;
		}

	}
}


