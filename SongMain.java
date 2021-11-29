import java.util.*;
import java.io.*;
import java.lang.*;
public class SongMain
{
	public static void printMenu()
	{
		System.out.println("==============Select Action =============");
		System.out.println("0. Quit");
		System.out.println("1. Get Collection Size");
		System.out.println("2. Search for Title");
		System.out.println("3. Search for Artist");
		System.out.println("4. Add From File");
		System.out.println("5. Save To File");
		System.out.println("6. Add One Song");
		System.out.println("7. Remove One Song");
		System.out.println("8. Show");
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		SongCollection coll = new SongCollection();
		while(true)
		{
			printMenu();
			String key, file;
			int op =Integer.parseInt(sc.nextLine());
			switch (op)
			{
				case 0:
				System.exit(0);

				case 1: 
				System.out.println("Collection Size is : "+coll.size());
				break;
				
				case 2:
				System.out.println("Enter Title Search Key:");
				key=sc.nextLine();
				coll.searchByTitle(key);
				break;
				
				case 3:
				System.out.println("Enter Artist Search Key");
				key=sc.nextLine();
				coll.searchByArtist(key);
				break;
				
				case 4:
				System.out.println("Enter File Name :");
				file=sc.nextLine();
				File f=new File(file);
				coll.addFromFile(f);
				break;
				
				case 5:
				System.out.println("Enter File Name :");
				file=sc.nextLine();
				File g=new File(file);
				coll.writeToFile(g);
				break;
				
				case 6:
				System.out.println("Enter title of Song :");
				String title=sc.nextLine();
				System.out.println("Enter Artist of Song :");
				String artist=sc.nextLine();
				coll.addOneSong(title,artist);
				break;
				
				case 7:
				System.out.println("Enter index of Song :");
				int index=Integer.parseInt(sc.nextLine());
				coll.delete(index);
				break;
				
				case 8:
				System.out.println("Enter Starting index of Range :");
				int start=Integer.parseInt(sc.nextLine());
				System.out.println("Enter Ending index of Range :");
				int end=Integer.parseInt(sc.nextLine());
				coll.show(start,end);
				break;
			}
		}
	}
}


