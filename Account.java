package banking6;

public class Account {
	protected double balance;//�˻���
	public Account(){
		
	}
	
	public Account(double init_balance){
		this.balance=init_balance;
	}
	public double getBalance(){
		return this.balance;
	}
	
	//��Ǯ��
	public boolean deposit(double amt){
		this.balance+=amt;
		return true;
	}
	

	//ȡǮ
	public  boolean withdraw(double amt){
		if(this.balance>=amt){
			this.balance-=amt;
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Account []";
	}

}
