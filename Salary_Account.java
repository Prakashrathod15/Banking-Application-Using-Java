package com.pankaj.rathod;

import java.time.LocalDate;
import java.util.Scanner;

//import java.time.LocalDate;

public class Salary_Account extends Saving_Account{
	
	
	double interest;
	 int last_transaction_date;
	 boolean froze ;
	
	  
	  

	 public Salary_Account(String acc_h, int acc_no, int bal,int date) {
		super(acc_h, acc_no, bal);
		
		this.interest = this.balence*01;
		this.last_transaction_date = date;
		this.froze = false;
		
	}

	public double getInterest() {
		return interest;
	}




	public void setInterest(double interest) {
		this.interest = interest;
	}




	public int getLast_transaction_date() {
		return last_transaction_date;
	}




	public void setLast_transaction_date(int last_transaction_date) {
		this.last_transaction_date = last_transaction_date;
	}
	public int date()
	{
		int date = 0;
		System.out.println(" Enter date in yyyy-mm-dd format ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		LocalDate d = LocalDate.parse(s);
		int day = d.getDayOfMonth();
		int month = d.getMonthValue();
		month = month*30;
		int year = d.getYear();
		
		date = day+month+year;
		
		return date;
	}
	void withdraw(int amt) {
		// TODO Auto-generated method stub
		int today_date = this.date();
		if(today_date-this.last_transaction_date>60)
		{
			System.out.println(" Your withdral function is frozed ");
			this.froze = true;
		}
		else {
			
			if(this.froze==false)
			{
			if(this.balence==min)
			{
				
				System.out.println("\n--------------------- Withdraw -------------------------------------\n");
				System.out.println(" Your Not Able To Withdraw ");
				System.out.println(" Balence is : "+this.balence);
				System.out.println("\n--------------------------------------------------------------------");

		
			}
			else
			{
				if(this.balence>min && min>amt)
				{
					this.balence = this.balence-amt;
					System.out.println("\n--------------------- Withdraw -------------------------------------\n");
					System.out.println(amt+" amount is debited from your account ");
					System.out.println("\n--------------------------------------------------------------------");
					this.last_transaction_date = today_date;
					
				}
				else
				{
					if(this.balence>min && min<amt)
					{
						
						System.out.println("\n--------------------- Withdraw -------------------------------------\n");
						double var = this.balence-min;
						System.out.println(" Operation failed ! ");
						System.out.println(" Enter Amount between 1 to "+var);
						System.out.println("\n--------------------------------------------------------------------");
						
						
					}
				}
			}
			}
		}
	
	}
	
	void deposit(int amt) {
		// TODO Auto-generated method stub
		System.out.println("\n---------------------- Depositt ------------------------------------");
		this.balence = this.balence+amt;
		int var = (int) (this.balence+this.calculateInterest());
		System.out.println(" Amount "+amt+" added in Your account ");
		var = var/10;
		System.out.println(" Interest is : "+var);
		this.balence = this.balence+var;
		System.out.println(" Salary Account Balence with Interest : "+this.balence);
		System.out.println("\n--------------------------------------------------------------------");
		
	}
	




	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println('\n');
		System.out.print('\t'+" Account details are given below :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Account Type is : Salary Account ");
		System.out.print('\t'+" Account Number is : "+ this.Acc_number);
		System.out.print('\n');
		System.out.print(" Account Name is : "+ this.Acc_holder_name);
		System.out.print('\t'+"         Account balence is : "+ this.balence);
		System.out.print('\n');
		//System.out.print("\n\t            Account Transaction date is : " );
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		
	}

       
	
}
