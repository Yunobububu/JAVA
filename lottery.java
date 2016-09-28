//lottery
import java.util.Scanner;
public class Noob{
	public static void main(String[] avrgs){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two  number:\n");
		String str=input.nextLine();
		String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
		char lotteryDigit1=lottery.charAt(0);
		char lotteryDigit2=lottery.charAt(1);
		char guessDigit1=str.charAt(0);
		char guessDigit2=str.charAt(1);

		if(str.length()!=2)
		{
			System.out.println("Your input is invalid");
			System.exit(1);
		}


		else
		{	while((!Character.isDigit(str.charAt(0)))
				||(!Character.isDigit(str.charAt(1))))
			{
				System.out.println("Please input numbers\n");
				str=input.nextLine();
			}
			System.out.println(lottery);
			if(str.equals(lottery))
			System.out.println("Lucky $10000\n");
			else if((lotteryDigit1==guessDigit2)&&(lotteryDigit2==guessDigit1))
				{
					System.out.println("Lucky $3000");
				}
			else if(lotteryDigit1==guessDigit1||lotteryDigit1==guessDigit2||
				lotteryDigit2==guessDigit2||lotteryDigit2==guessDigit1)
				{
					System.out.println("Lucy $1000");
				}
			else
				System.out.println("Sucks no bonus");
		}



	}
}
