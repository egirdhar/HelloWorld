package com.threads;

public class RyanMonica {

	public static void main(String[] args) {
		
	
	Account account = new Account(20);
	Runnable accountJob =new AccountJob(account);
	
	Thread ryan = new Thread(accountJob);
	Thread monika = new Thread(accountJob);
	ryan.setName("Ryan");
	monika.setName("monika");
	ryan.start();
	monika.start();
	
	}
}


class Account {
	
	private int balance;
	
public Account(int balance) {
	this.balance=balance;
	System.out.println(this.getBalance());
}

	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int amt){
		if(balance >= amt){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance =balance-amt;
	
		}
		else{
			System.out.println("insufficient balance");
		}
			
	}
	
}


class AccountJob implements Runnable{
	
	private Account account;
	
	public AccountJob(Account account) {
		this.account =account;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ");
			account.withdraw(5);
			System.out.println("balance now " + account.getBalance());
		}
		if(account.getBalance()< 0){
			System.out.println("OverWithdrawn...");
		}
		
	}
}
