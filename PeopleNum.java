//to get the number PI
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,death=0,birth=0,migrate=0,sum=312032486;
		int sec=365*60*24;
		birth=sec/45;
		migrate=sec/7;
		death=sec/13;
		for(i=1;i<=5;i++)
		{
			sum=sum+birth+migrate+death;
			System.out.print(sum);
			System.out.print("\n");
		}
		

	}

}
