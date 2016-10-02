//ans 9.3
public  class Welcome{
	public static void main(String[] args){
		java.util.Date date=new java.util.Date();
		System.out.println(date.getTime());
		long time=1000,i=0;
		for(i=1;i<=8;i++)
		{
			date.setTime(time);
			System.out.println(date.toString());
			time=10*time;
		}
	}
	}
