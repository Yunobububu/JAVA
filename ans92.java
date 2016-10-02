//ans 9.2
public  class Welcome{
	public static void main(String[] args){
		Welcome  stock1=new Welcome("ORCL","Corporation");
		stock1.setCurrentPrice(34);
		System.out.printf("The change is %.2f%% ",stock1.getChangePercent());


	}

	String name;
	String symbol;
	double currentPrice;
	 double previousClosingPrice;//constructor has the same name with the main class
	 Welcome(String newName,String newSymbole){
		 		  name=newName;
		 		  symbol=newSymbole;
			}
	 double getChangePercent(){
		return (currentPrice-34.5)/34.5*100;

	}
	  void setCurrentPrice(double newCurrentPrice){
		 currentPrice=newCurrentPrice;


	}

}
