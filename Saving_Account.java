package com.pankaj.rathod;

public class Saving_Account extends Account {

	 final int min = 10000;
	 double interest;
	 
	 
	public Saving_Account(String acc_h,int acc_no,int bal) {
		
		this.Acc_holder_name = acc_h;
		this.Acc_number = acc_no;
		this.balence = bal;
		this.interest = this.balence*0.1;
		
	}
	
	
	public double getInterest() {
		return interest;
	}
	
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	public int getMin() {
		return min;
	}
	
	double calculateInterest()
	{
		return this.interest/10;
	}
	@Override
	void deposit(int amt) {
		// TODO Auto-generated method stub
		System.out.println("\n---------------------- Depositt ------------------------------------");
		this.balence = this.balence+amt;
		int var = (int) (this.balence+this.calculateInterest());
		System.out.println(" Amount "+amt+" added in Your account ");
		var = var/10;
		System.out.println(" Interest is : "+var);
		this.balence = this.balence+var;
		System.out.println(" Saving Account Balence with Interest : "+this.balence);
		System.out.println("\n--------------------------------------------------------------------");
		
	}
	
	void withdraw(int amt) {
		// TODO Auto-generated method stub
		
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
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		System.out.print('\t'+" Account details are given below :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Account Type is : Saving Account ");
		System.out.print('\t'+" Account Number is : "+ this.Acc_number);
		System.out.print('\n');
		System.out.print(" Account Name is : "+ this.Acc_holder_name);
		System.out.print('\t'+"         Account balence is : "+ this.balence);
		System.out.print('\n');
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		
	}


	
	 
	

}
