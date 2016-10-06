package banking6;

public class Bank {
	private Customer[] customers;
	private  int numberOfCustomer;
	
	
	public  Bank(){
		customers=new Customer[5];
		
	}
	public Bank(Customer[] customers,int numberOfCustomer){
		this.customers=customers;
		this.numberOfCustomer=numberOfCustomer;
		
	}
	public void addCustomer(String f,String l){
		Customer cust=new Customer(f,l);
		customers[numberOfCustomer++]=cust;
	}
	public int getNumberOfCustomer(){
		
		
		return numberOfCustomer;
	}
	public Customer getCustomer(int index){
		return this.customers[index];
	}

}
