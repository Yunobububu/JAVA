//to get the number PI
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		double k,sum=0,s=1.0;
		for(i=1;i<1000;i++)
		{
			k=s/(2*i-1);
			sum=sum+k;
			s=-s;
		}
		System.out.print(4*sum);

	}

}
