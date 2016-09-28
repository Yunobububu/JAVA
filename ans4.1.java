//answer 4.1
import java.util.Scanner;
public class Noob{
	public static void main(String[] arvgs){
		System.out.println("Please input the length from center to vertex\n");
		Scanner input=new Scanner(System.in);
		double r=input.nextDouble();
		double s=2*r*Math.sin(Math.PI/5);
		double area=5*Math.pow(s,2)/(4*Math.tan(Math.PI/5));
		System.out.printf("The aera of the pentagon is:%.2f",area);


	}
}
