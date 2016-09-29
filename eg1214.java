//java.io
import java.io.IOException;
public class Test {

	public static void main(String[] args) throws IOException {
		java.io.File file=new java.io.File("scores.txt");
		if(file.exists()){
			System.exit(1);
		}
		try(
			java.io.PrintWriter output=new java.io.PrintWriter(file);
		)
		{
			output.print("John t Smith ");
			output.println("90");
			output.close();

		}
	}
}


