
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount myaccount = new BankAccount("John",5000);
		BankAccount bobaccount = new  BankAccount("BOB");
		
		bobaccount.deposits(500);
		System.out.println("owner : "+ bobaccount.getOwner());
		System.out.println("balance :" + bobaccount.getBalance());
		
		bobaccount.withdraw(1000);
		System.out.println("owner : "+ bobaccount.getOwner());
		System.out.println("balance :" + bobaccount.getBalance());
		System.out.println();
		
		
		
		System.out.println("owner : "+ myaccount.getOwner());
		System.out.println("Deposit 200? ");
		System.out.println("balance :" + myaccount.getBalance());
		myaccount.deposits(200);
		System.out.println("balance :" + myaccount.getBalance());
		myaccount.withdraw(100);
		System.out.println("balance :" + myaccount.getBalance());
		
		
		
		
	}//end main
}
