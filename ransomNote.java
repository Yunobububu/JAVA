//Ransom Note
import java.util.Scanner;
public class Welcome{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the ransomNote\n");
		String ransomNote=input.nextLine();
		System.out.println("Please input the ransom\n");
		String magazine=input.nextLine();
		
		System.out.println(isContains(ransomNote,magazine));
		
		
	} static boolean isContains(String string1,String string2){
	return string1.contains(string2);
	
}
}

	
	
