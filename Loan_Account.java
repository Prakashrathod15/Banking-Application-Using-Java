package com.pankaj.rathod;

import java.util.Scanner;

public class Loan_Account extends Saving_Account {
	
	int repay;
	double interest;
	int Emi;

	public Loan_Account(String acc_h, int acc_no, int bal, int emi) {
		
		super(acc_h, acc_no, bal-bal*2);
		this.interest = this.balence*0.1;
		this.Emi = emi;
	}
	
public void totalEmi()
	{
		System.out.println("\n---------------------- Emi ------------------------------------");
		System.out.println(" Number of EMI Present : "+this.Emi);
		int var = this.balence/this.Emi;
		System.out.println(" Amount Pay for Each EMI : "+var);
		System.out.println("\n--------------------------------------------------------------------");
	}
	
	void deposit(int amt) {
		// TODO Auto-generated method stub
		System.out.println("\n---------------------- Depositt ------------------------------------");
		this.balence = this.balence+amt;
		int var = (int) this.interest;
		System.out.println(" Repay amount : "+this.repay);
		System.out.println(" Amount "+amt+" added in Your account ");
		var = var/10;
		System.out.println(" Interest is : "+var);
		this.balence = this.balence+var;
		System.out.println(" Loan Account Balence with Interest : "+this.balence);
		this.repay = amt;
		this.Emi--;
		System.out.println("\n--------------------------------------------------------------------");
		
	}
	
	void withdraw(int amt) {
		// TODO Auto-generated method stub
		
	  if(this.balence<0)
	  {
		System.out.println("\n--------------------- Withdraw -------------------------------------\n");
		System.out.println(" Your Not Able to Withdraw Amount from Loan Account Until pay current loan");
		System.out.println(" Operation failed ! ");
		System.out.println("\n--------------------------------------------------------------------");
	  }
	  else if(this.balence==0)
	  {
		  System.out.println("\n--------------------- Withdraw -------------------------------------\n");
		  System.out.println(" Re-Enter Amount for loan ");
		  Scanner sc = new Scanner(System.in);
		  int loan = sc.nextInt();
		  System.out.println(" Enter Number of Emi ");
		  this.Emi = sc.nextInt();
		  this.balence = this.balence-loan;
		  System.out.println(" You have successfully taken "+loan+" amount of loan ");
		  System.out.println(" Your balence is : "+this.balence);
		  System.out.println("\n--------------------------------------------------------------------");
	  }
		
	
	}
	
	public int getEmi()
	{
		return this.Emi;
	}

	public void setEmi(int e)
	{
		this.Emi = e;
	}
	public int getRepay() {
		return repay;
	}

	public void setRepay(int repay) {
		this.repay = repay;
	}
	
	public void display()
	{
		System.out.println('\n');
		System.out.print('\t'+" Account details are given below :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Account Type is : Loan Account ");
		System.out.print('\t'+" Account Number is : "+ this.Acc_number);
		System.out.print('\n');
		System.out.print(" Account Name is : "+ this.Acc_holder_name);
		System.out.print('\t'+"         Account balence is : "+ this.balence);
		System.out.print('\n');
		
		System.out.println("\n--------------------------------------------------------------------\n");
	}
	
	

}
