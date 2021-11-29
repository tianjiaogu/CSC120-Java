import java.util.Scanner;
public class NiftyPrint{

	public static void main (String[] args)
{
	Scanner keyboard = new Scanner (System.in);
	System.out.print("Enter width:");
	int width = keyboard.nextInt();
	System.out.printf("Enter formatting option\n" + "LEFT=0,RIGHT=1,CENTER=2: ");
    int option = keyboard.nextInt();
    String text = "you may use these photos to support your teachings.";
    format(text,width,option);
}

public static void format( String text, int width, int option){
	
	text.replace("\t"," ");

	StringBuilder worldBuilder = new StringBuilder();
	StringBuilder lineBuilder = new StringBuilder();

	for (int i=0; i<text.length();i++ ){
		if (text.charAt(i)!=' ' && text.charAt(i)!='\n' ){
			worldBuilder.append(text.charAt(i));
		}
		else{
			if (worldBuilder.length()>0){
					if(lineBuilder.length() == 0){
						lineBuilder.append(worldBuilder.toString());

					}else if(lineBuilder.length() + worldBuilder.length() + 1 <= width){
						lineBuilder.append(" " + worldBuilder.toString());
					}else if(lineBuilder.length() + worldBuilder.length() + 1 > width){
						flush(lineBuilder,width,option);
						lineBuilder.append(worldBuilder.toString());
						lineBuilder.delete(0,lineBuilder.length());
					}
					worldBuilder.delete(0,worldBuilder.length());
				}
			}
		}

	}

	public static void flush(StringBuilder builder, int width, int option){
		if (option == 0)
		{		
		//let it print normally which is left flush 
		System.out.println(builder.toString ());
		}
			else if (option == 1)
			{
			int right = width - builder.length();

			// i represents the number of spaces here
			for (int i = 0 ; i < right ; i++)
			{
			System.out.print(" ");
			}
                         System.out.println(builder.toString ());
			}	
				if (option == 2)
				{
				int centre = (width - builder.length())/2;
				for (int i = 0 ; i <= centre ; i++)
				{
			         System.out.print(" ");
				}
                         System.out.println(builder.toString ());
				}
}
   
}







