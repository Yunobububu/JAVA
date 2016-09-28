import java.util.Scanner;
public class Noob{
	public static void main(String[] args){
		System.out.println("Please input the number between 1 and 100\n");
		Scanner input=new Scanner(System.in);
		String num=input.nextLine();
		String[] num2=num.split(" ");
		int i;
		int[] num3=new int[101];
		int[] num4=new int[101];

		for(i=0;i<num2.length;i++)//convert string to array
		{
			num3[i]=Integer.parseInt(num2[i]);
		}
		for(i=0;i<num2.length;i++)//count the times of the number
		{
			if(num3[i]<=100&&num3[i]>0)
			num4[num3[i]]=num4[num3[i]]+1;
		}
		for(i=0;i<101;i++)
		{
			if(num4[i]==1)
				System.out.printf("%d occers 1 time\n",i);
			else if(num4[i]>1)
				System.out.printf("%d occers %d times\n",i,num4[i]);
		}



		//int[] a=new int[101];


	}
}
