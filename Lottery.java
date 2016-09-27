import java.util.Scanner;
public class Noob{
	public static void main(String[] args)
	{
		int lottery=(int)(Math.random()*10)*10+(int)(Math.random()*10);
		int decimal=lottery/10;
		int units=lottery%10;
		System.out.println("Please the first num\n");			
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		System.out.println("Please the second num\n");
		int num2=input.nextInt();
		if((num1==decimal)&&(num2==units))
			System.out.println("You get 10000");
		else if((num1==units)&&(num2==decimal))
			System.out.println("You get 3000");
		else if ((num1==units)||(num2==decimal))
			System.out.println("You get 1000");
		else  System.out.println("You get 0");
		
	}
}