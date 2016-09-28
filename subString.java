import java.util.Scanner;
public class Welcome{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the first string\n");
		String string1=input.nextLine();
		System.out.println("Please input the second string\n");
		String string2=input.nextLine();
		
		System.out.println(isContains(string1,string2));
		
		
	} static boolean isContains(String string1,String string2){
	return string1.contains(string2);
	
}
}

	
	
