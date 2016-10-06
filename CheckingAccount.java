package banking6;
//ÐÅÓÃÕË»§

public class CheckingAccount extends Account{
	private double overdraftProtection;
	public CheckingAccount(double balance){
		super(balance);
	}
	public CheckingAccount(double balnace,double protect){
		super();
		this.overdraftProtection=protect;
	}
	public boolean withdraw(double balance,double amt){
		if(balance>=amt){
			balance-=amt;
			return true;
		}else if(overdraftProtection>=amt-balance){
			overdraftProtection-=amt-balance;
		balance=0;
		return true;
		}else {
		return false;
		}
	}
	public double getOverdraftProtection() {
		return overdraftProtection;
	}
	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	
}



