package banking6;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] account;
	private int accountNumber;
	
	public Customer(){
		
	}
	public Customer(String f,String l){
		this.firstName=f;
		this.lastName=l;
		account=new Account[5];
		
	
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
//	public Account getAccount(){
//		return this.account;
//	}
//	public void setAccount(Account acct){
//		this.account=acct;
//	}
//	public Account getAccount(Account account){
//		return this.account=account;
//	}
	public void addAccount(Account acct){
		account[accountNumber++]=acct;
		
	}
	public Account getAccount(int index){
		return account[index];
	}
	public int getNumberOfAccount(){
		return accountNumber;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName+"]";
	}
}



