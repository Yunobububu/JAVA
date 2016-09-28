//the aera of polygon
import java.util.Scanner;
public class Noob{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the number of slids:\n");
		int n=input.nextInt();
		System.out.println("Enter the slid\n");
		double s=input.nextDouble();

		double aera=n*Math.pow(s, 2)/(4*Math.tan(Math.PI/n));
		System.out.printf("The aera of the polygon is : %.4f\n",aera);
		input.close();

	}
}
