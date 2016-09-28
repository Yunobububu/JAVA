//transform hex to decimal
import java.util.Scanner;
public class Noob{
	public static void main(String[] arvgs){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the char\n");
		String hexString=input.nextLine();
		if(hexString.length()!=1)
		{
			System.out.println("You must enter only char\n");
			System.exit(1);
		}


			char ch=Character.toUpperCase(hexString.charAt(0));
			if(ch>='A'&&ch<='F')
			{
				int value=ch-'A'+10;
				System.out.println("The number is "+value);
			}
			else if(Character.isDigit(ch))
			{
				System.out.println(ch);
			}
			else
				System.out.println("You must enter a charater");
	}
}
