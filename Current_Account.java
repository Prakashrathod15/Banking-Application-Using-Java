package com.pankaj.rathod;

public class Current_Account extends Account {

	
	 int odLimit;
	 double interest;
	
	 
	public Current_Account(String bank_hol, int acc_no,int bal ) {
		
		this.Acc_holder_name = bank_hol;
		this.Acc_number = acc_no;
		this.balence = bal;
		this.odLimit = 50000;
		this.interest = this.balence*0.2;
		
	}

	
	public int getOdLimit() {
		return odLimit;
	}


	public void setOdLimit(int odLimit) {
		this.odLimit = odLimit;
	}


	@Override
	void deposit(int amt) {
		
		if(this.odLimit!=50000)
		{
			if(this.odLimit+amt>50000)
			{
				int amount = 50000-this.odLimit;
				this.odLimit = this.odLimit+amount;
				int var = amt-amount;
				this.balence = this.balence+var;
				System.out.println("\n---------------------- Depositt ------------------------------------");
				System.out.println(" Amount is : "+amount);
				System.out.println(" var is : "+var);
				System.out.println(" Amount "+amt+" added in Your account ");
				System.out.println(" Current Account Balence : "+this.balence);
				System.out.println(" Current OdLimit Balence : "+this.odLimit);
				System.out.println("\n--------------------------------------------------------------------");
			}
			else
			{
				//this.balence = this.balence+amt;
				this.odLimit = this.odLimit+amt;
				System.out.println("\n---------------------- Depositt ------------------------------------");
				System.out.println(" Amount "+amt+" added in Your account ");
				System.out.println(" Current Account Balence : "+this.balence);
				System.out.println(" Current OdLimit Balence : "+this.odLimit);
				System.out.println("\n--------------------------------------------------------------------");
			}
		}
		else
		{
			if(this.odLimit==50000)
			{
				this.balence = this.balence+amt;
				System.out.println("\n---------------------- Depositt ------------------------------------");
				System.out.println(" Amount "+amt+" added in Your account ");
				System.out.println(" Current Account Balence : "+this.balence);
				System.out.println(" Current OdLimit Balence : "+this.odLimit);
				System.out.println("\n--------------------------------------------------------------------");
			}
		}
	}

	
	void withdraw(int amt) 
	{
		
		//this.balence = (int) (this.balence+this.interest);
		if(this.balence==0 && this.odLimit==0)
		{
			System.out.println("\n--------------------- Withdraw -------------------------------------\n");
			System.out.println(" Your Not Able To Withdraw ");
			System.out.println(" Balence is : "+this.balence);
			System.out.println(" Odlimit is : "+this.odLimit);
			System.out.println("\n--------------------------------------------------------------------");

		}
		
		if(this.balence>=0 || this.odLimit >=0)
		{
			if(this.balence!=0)
			{  
				if(this.balence<amt)
				{
					   System.out.println("\n--------------------- Withdraw -------------------------------------\n");
					   //System.out.println("Balence with interest is : "+this.balence);
					int	rem = amt-this.balence;
					this.balence = 0;
					this.odLimit = this.odLimit-rem;
					   
					   System.out.println(rem+" amount is debited from your odLimit ");
					   System.out.println("OdLimit of Your Account is : "+this.odLimit);
					   System.out.println("\n--------------------------------------------------------------------");
				}
				else
				{
					   this.balence = this.balence-amt;
					   System.out.println("\n--------------------- Withdraw -------------------------------------\n");
					   System.out.println(amt+" amount is debited from your account ");
					   System.out.println("Account balence is : "+this.balence);
					   System.out.println("\n--------------------------------------------------------------------");
				}
			}
			else 
			{
				if(this.odLimit!=0)
				{
				  int rem = this.odLimit-amt ;
				  
				  if(this.odLimit<amt)
				  {
					  int var = -1;
					  int amount = this.odLimit-var;
					  amount--;
					  this.odLimit = this.odLimit-amount;
					  this.odLimit = 0;
					  System.out.println("\n--------------------- Withdraw -------------------------------------\n");
					  System.out.println(amount+" amount is debited from your account ");
					  System.out.println(" Account balence is : "+this.balence);
					  System.out.println(" Account odLimit is : "+this.odLimit);
					  System.out.println("\n--------------------------------------------------------------------");
				  }
				  else
				  {
					  this.odLimit = this.odLimit-amt;
					  System.out.println("\n--------------------- Withdraw -------------------------------------\n");
					  System.out.println(amt+" amount is debited from your account ");
					  System.out.println(" Account balence is : "+this.balence);
					  System.out.println(" Account odLimit is : "+this.odLimit);
					  System.out.println("\n--------------------------------------------------------------------");
				  }
				  
				}
				  
				
			}
			
		}
		
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println('\n');
		System.out.print('\t'+" Account details are given below :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Account Type is : Current Account ");
		System.out.print('\t'+" Account Number is : "+ this.Acc_number);
		System.out.print('\n');
		System.out.print(" Account Name is : "+ this.Acc_holder_name);
		System.out.print('\t'+"         Account balence is : "+ this.balence);
		System.out.print('\n');
		System.out.print("\n\t            Account odLimit is : "+ this.odLimit);
		System.out.print('\n');
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		
	}

}
