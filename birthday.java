import java.util.*;
public class birthday{
	public static void main(String[] args){
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter the no. of people: ");
		int nPeople = keyboard.nextInt();
		System.out.println(nPeople);
		System.out.println("Enter the no. of repetitions: ");
		int nRep = keyboard.nextInt();
	 	System.out.println(nRep);
		experiment1(nPeople,nRep);
	}

	public static int[] oneTrial(int nPeople){
		int[] theCounts = new int[365];
		for(int i=0; i<nPeople; i++){
			int birthday = (int)(Math.random()*365);
			theCounts[birthday]++;
		}
		return theCounts;
	}

	public static boolean hasAHit(int[] theCounts){
		for(int k=0; k<theCounts.length; k++){
			if (theCounts[k]>1){
				return true;
			}
		}
		return false;
	}

	public static int experiment1(int nPeople, int nRep){
		int[] theCounts = new int[365];
		double hitRate=0;
 		for (int j=0; j<nRep; j++){
 			theCounts = oneTrial(nPeople);
 			if (hasAHit(theCounts)==true){
 				hitRate++;
 			}
 		}
 		System.out.print("Result= ");
 		System.out.println(hitRate/nRep);java
 		return 0;
	}


}