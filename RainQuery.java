import java.util.*;
import java.io.*;
public class RainQuery{

	public static final String FILENAME = "precipitation.txt";
	public static final int FIRST_YEAR = 1931;
	public static final int LAST_YEAR = 2013;
	public static final int YEAR_SIZE = 12 * 31;
	public static final int N_YEARS = LAST_YEAR - FIRST_YEAR + 1;
	public static final int FULL_SIZE = N_YEARS * YEAR_SIZE;



	public static double[] readData() throws FileNotFoundException{

		File myFile = new File("precipitation.txt");
		Scanner myScanner = new Scanner (myFile);
		double[] array= new double[FULL_SIZE];

		int pos=0;

		for ( int m = 1; m <= N_YEARS * 12; m ++ ) {

			System.out.println( myScanner.nextInt() );
			System.out.println( myScanner.nextInt() );
			for ( int k = 1; k <= 31; k ++ ) {
				array[pos]=myScanner.nextDouble();
				System.out.println( pos + ":" + array[ pos ]);
				pos++;
			}

		}

		return array;
	}


	public static int join(int year, int month, int day){

		if (year < FIRST_YEAR || year > LAST_YEAR || month < 1 || month > 12 || day < 1 || day > 31){
			return -1;
		}
		return (year-FIRST_YEAR)*YEAR_SIZE+(month-1)*31+day-1;
			
	}

	public static void showStats(double[] data, int start, int end, int increment){
		double max = -1;
		double min = 100000;
		double count = 0;
		if(start < end){
			for(int i = start; i <= Math.floor((end-start)/increment); i++){
				count += data[start+ i*increment];
				max = Math.max(max, data[start + i*increment]);
				min = Math.min(min, data[start + i*increment]);
			}
			double ave = count/((end-start)/increment);
			System.out.printf("Total point: %d, average: %f, max: %f, min: %f", (int)count , ave, max, min);
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		double[] data = readData();

		Scanner keyboard = new Scanner( System.in );
		int choice = 100, month, day, year, index, year1, year2;
		int month1, month2, day1, day2, index1, index2;
		while ( choice != 0 ) {
			System.out.println("You can query the database");
			System.out.println("1. Daily value");
			System.out.println("2. Range statistic");
			System.out.println("3. Day statistics");
			System.out.println("4. Day of the month statistics");
			System.out.println("0. Quit");
		
			System.out.print( "Enter your choice: ");
			choice = keyboard.nextInt();
			switch ( choice ) {
				case 1:
				System.out.print( "Enter year, month, day: ");
				year = keyboard.nextInt();
				month = keyboard.nextInt();
				day = keyboard.nextInt();
				index = join( year, month, day );
				if ( index >= 0 ) {
					System.out.printf( "The value is %.3f\n", data[ index ] );
				}
				break;

				case 2:
				System.out.print( "Enter start year, month, day: ");
				year1 = keyboard.nextInt();
				month1 = keyboard.nextInt();
				day1 = keyboard.nextInt();
				index1 = join( year1, month1, day1 );
				System.out.print( "Enter end year, month, day: ");
				year2 = keyboard.nextInt();
				month2 = keyboard.nextInt();
				day2 = keyboard.nextInt();
				index2 = join( year2, month2, day2 );
				showStats( data, index1, index2, 1 );
				break;

				case 3:
				System.out.print( "Enter month, day: ");
				month = keyboard.nextInt();
				day = keyboard.nextInt();
				index1 = join( FIRST_YEAR, month, day );
				index2 = join( LAST_YEAR, month, day );
				showStats( data, index1, index2, YEAR_SIZE );
				break;

				case 4:
				System.out.print( "Enter day: ");
				day = keyboard.nextInt();
				index1 = join( FIRST_YEAR, 1, day );
				index2 = join( LAST_YEAR, 12, day );
				showStats( data, index1, index2, 31 );
				break;



			}
		}
	}





}