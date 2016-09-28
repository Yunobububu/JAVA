//three points in the a cicle with the radius of 40;
public class Noob{
	public static void main(String[] args){
		double randomAngle=Math.random()*(Math.PI*2);
		int r=40,i=3;
		double[] x=new double[3];
		double[] y=new double[3];
		for(i=0;i<3;i++)
		{
			x[i]=r*Math.cos(randomAngle);
			y[i]=r*Math.sin(randomAngle);
			randomAngle=Math.random()*(Math.PI*2);

		}
		double slid1=slid(x[0],y[0],x[1],y[1]);
		double slid2=slid(x[1],y[1],x[2],y[2]);
		double slid3=slid(x[0],y[0],x[2],y[2]);
		double angle1=angle(slid1,slid2,slid3);
		double angle2=angle(slid1,slid3,slid2);
		double angle3=angle(slid2,slid3,slid1);

		System.out.printf("The degrees are:%.2f¡ã,%.2f¡ã,%.2f¡ã\n",angle1,angle2,angle3);
		System.out.printf("The slids are:%.2f,%.2f,%.2f\n",slid1,slid2,slid3);

	}

	public static double slid(double a,double b,double c,double d){
		double result=0;
		return  result=Math.sqrt(Math.pow((a-c),2)+Math.pow((b-d),2));

	}
	public static double angle(double a,double b,double c){
		double result=Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b));
		double degree=result*180/Math.PI;
		return degree;
	}
}

