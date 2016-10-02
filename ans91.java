//ans 9.1
public class Welcome{

	public static void main(String[] args){
		Rectangle rectangle1=new Rectangle(4,2);
		System.out.printf("%.2f,%.2f\n",rectangle1.width,rectangle1.height);
		System.out.println(rectangle1.getAera());
		System.out.println(rectangle1.getPrimeter());


	}
	public static class Rectangle{
			double width;	//DataField
			double height;	//DataField
		 Rectangle(){		//Defalut constructor
			double width=1;
			double height=1;
		 }
		 					//Constructor
		 Rectangle(double newWidth,double newHeight){
			 width=newWidth;
			 height=newHeight;

		}				   //Method
		public double getAera(){
			return width*height;
		}				 //Method
		public double getPrimeter(){
			return 2*(width+height);

		}
		}
	}





