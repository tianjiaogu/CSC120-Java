import java.util.Scanner;
import java.lang.Math;

public class TreasureHunting{
	static int prevX, prevY, nowX, nowY, trueX, trueY;


	public static void main(String args[]){
		System.out.println("#######################################################");
		System.out.println("# A treasure has been hidden at a location in a 10x10 #");
		System.out.println("# gird. Guess where it is. You have 10 chances.       #");
		System.out.println("#######################################################");

		


		Scanner keyboard = new Scanner (System.in);
		nowX=-1;
		nowY=-1;
		trueX=(int)(Math.random()*9+1);
		trueY=(int)(Math.random()*9+1);
		System.out.printf("truex: %d truey: %d\n",trueX,trueY);
	

		for(int i = 1;i <= 10;i++){
            System.out.printf("---- Round %d ----\n",i);
            

		if (i >= 2){
			show(prevX,prevY,nowX,nowY);
			System.out.print("print X Y");
		}
		prevX = nowX;
		prevY = nowY;
		nowX = keyboard.nextInt();
		nowY = keyboard.nextInt();
		checkDistance(nowY,nowX,trueX,trueY);
		if (nowX != trueX||nowY != trueY){
			advise(prevX,prevY,nowX,nowY,trueX,trueY);
		}
		if (nowX == trueX && nowY == trueY){
			return;
		}
     }
		
    }



    public static void show(int prevX,int prevY,int nowX,int nowY){
    	
    	for(int i=10; i>= 0; i--){
    		for (int k=1;k <=10;k++) {

    			if (k == nowX && i == nowY){
    				System.out.print("@");
    			}
    			else if (k == prevX && i == prevY){
    				System.out.print("P");
    			}
    			else 
    				System.out.print(".");
    		}
    		System.out.printf("%d\n",i);
    	}
    }

    public static int checkDistance(int nowY,int nowX,int trueY,int trueX){
    	int d = Math.abs(trueX - nowX) + Math.abs(trueY - nowY);
    	if (d==0){
    		System.out.println("You have found the treasure!");
    		
    	}
    	

    	else if (d >= 1 && d <= 3){
    		System.out.println("The distance is no more than 3.");
    	}

    	else if (d <= 4 && d >= 6){
    		System.out.println("The distance is no more than 6.");
    	}

    	else 
    		System.out.println("The distance is more than 6.");

    	return d;
    }


    public static void advise(int prevY,int prevX,int nowX,int nowY,int trueX,int trueY){

    	int a = Math.abs(trueX-prevX) + Math.abs(trueY-prevY);
        int b = Math.abs(trueX-nowX) + Math.abs(trueY-nowY);
        int c = b-a;

        if (c == 0){
    	   System.out.println("The same distance");
    }

        if (c >= 1){
    	   System.out.println("You are farther.");
    }

        if (c <= -1){
    	   System.out.println("You are closer.");
    }
    }

    

}