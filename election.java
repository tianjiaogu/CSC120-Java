import java.util.*;
public class election{
	public static int find(String[]names, String name){
		int index;
		for(index = 0; index < names.length; index++){
			if (names[index].equals(name)){
				return index;
			}
		}
		return -1;
	}


    public static String[] addName( String[] names, String name ){
    	String[] Newname = new String[names.length+1];
    	for(int i = 0; i < names.length; i++){
    		Newname[i] = names[i];
    	}
    	Newname[Newname.length-1] = name;
    	return Newname;
    }

    public static int[] addNewCount( int[] counts ){
    	int[] Newcounts = new int[counts.length+1];
    	for(int i = 0; i < counts.length; i++){
    		Newcounts[i] = counts[i];
    	}
    	Newcounts[Newcounts.length-1] = 1;
    	return Newcounts;
    }

    public static void findWinner(String[] names, int[] counts ){
    	for(int i=0; i<names.length; i++){
    		System.out.println(names[i]+" received "+ counts[i]+ " votes.");
	}
		int maxCount=0;
		int theWinner=0;
     	for(int j=0; j<counts.length; j++){
     		if(counts[j]>maxCount){
     			maxCount=counts[j];
     			theWinner=j;
     		}
     	}

     	System.out.println("The winner is " + names[theWinner]);
	}

    
    public static void main(String[] args){
    	String[] names = new String[0];
    	int[] counts = new int[0];
    	int index;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("###########################################");
    	System.out.println("# Enter the votes, one vote per line.     #");
    	System.out.println("# End with either CTRL-D or an empty line.#");
    	System.out.println("###########################################");
    	while(keyboard.hasNext()){
    		String name=keyboard.nextLine();
   
    			index = find(names, name);
    			if(index >= 0){
    				counts[index] ++;
    			}else{
    				names = addName(names,name);
    				counts = addNewCount(counts);
    			}

    	}
		findWinner(names,counts);
    }

}
