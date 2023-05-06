package com.pankaj.rathod;

import java.time.LocalDate;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		int size;
		System.out.println(" Enter Bank account capacity ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		Account[] Account_array = new Account[size];
		int index = 0;
		
		int stop = 0;
		
		while(stop!=10)
		{
			System.out.println();
			System.out.println("1.Open Bank Account ");
			System.out.println("2.Withdraw ");
			System.out.println("3.deposit ");
			System.out.println("4.Account details ");
			System.out.println("5.Bank All Opened Account ");
			System.out.println("6.Exit ");
			System.out.println("  Enter choice ");
			int op = sc.nextInt();
			
			switch(op)
			{
			
			 case 1:
			 {
				 index = OpenAccount(Account_array,index);
				 break;
			 }
			 case 2:
			 {
				 WithdrawAccount(Account_array,index);
				 break;
			 }
			 case 3:
			 {
				 deposit(Account_array,index);
				 break;
			 }
			 case 4:
			 {
				 Account_details(Account_array,index);
				 break;
			 }
			 case 5:
			 {
				 all_Account(Account_array,index);
				 break;
			 }
			 case 6:
			 {
				 stop = 10;
				 break;
			 }
			 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void all_Account(Account[] arr, int index)
	{
		
		if(index!=0)
		{
			for(int i =0; i<index; i++)
			{
				arr[i].display();
			}
		}
		else
		{
			System.out.println(" Please Open Account ");
			System.out.println(" Number of account present in the bank is : "+0);
		}
		
	}
	
	public static void Account_details(Account[] arr,int index)
	{
		if(index!=0)
	    {
		System.out.println(" Enter Your name ");
		Scanner sc = new Scanner(System.in);
		String holder = sc.next();
		System.out.println(" Enter Account number ");
		int n = sc.nextInt();
		
		int found = -1;
		int i;
		for(i = 0; i<arr.length; i++)
		{
			  if(arr[i].Acc_holder_name.equals(holder) && arr[i].Acc_number == n)
			  {
				  
				  found = i;
				  break;
			  }
		}
		
		if(i!=arr.length-1)
		{
			arr[found].display();
		}
		else
		{
			System.out.println(" Your Account Not Found ");
		}
	    }
	    else
	    {
	    	System.out.println("\n Not Able to deposit ");
	    	System.out.println(" Number of Opened Account in bank : "+0);
	    	System.out.println(" First Open Account   \n");
	    }
		
		
	}
	public static void deposit(Account[] arr, int index)
	{
		if(index!=0)
	    {
		System.out.println(" Enter Your name ");
		Scanner sc = new Scanner(System.in);
		String holder = sc.next();
		System.out.println(" Enter Account number ");
		int n = sc.nextInt();
		
		int found = -1;
		int i;
		for(i = 0; i<arr.length; i++)
		{
			  if(arr[i].Acc_holder_name.equals(holder) && arr[i].Acc_number == n)
			  {
				  
				  found = i;
				  break;
			  }
		}
		
		if(i!=arr.length-1)
		{
			arr[found].display();
			System.out.println(" Enter Amount for deposit ");
			int amt = sc.nextInt();
			arr[found].deposit(amt);
		}
		else
		{
			System.out.println(" Your Account Not Found ");
		}
	    }
	    else
	    {
	    	System.out.println("\n Not Able to deposit ");
	    	System.out.println(" Number of Opened Account in bank : "+0);
	    	System.out.println(" First Open Account   \n");
	    }
		
		
	}
	public static void WithdrawAccount(Account[] arr,int index)
	{
	    if(index!=0)
	    {
		System.out.println(" Enter Your name ");
		Scanner sc = new Scanner(System.in);
		String holder = sc.next();
		System.out.println(" Enter Account number ");
		int n = sc.nextInt();
		
		int found = -1;
		int i;
		for(i = 0; i<arr.length; i++)
		{
			  if(arr[i].Acc_holder_name.equals(holder) && arr[i].Acc_number == n)
			  {
				  
				  found = i;
				  break;
			  }
		}
		
		if(i!=arr.length-1)
		{
			arr[found].display();
			System.out.println(" Enter Amount for Withdraw ");
			int amt = sc.nextInt();
			arr[found].withdraw(amt);
		}
		else
		{
			System.out.println(" Your Account Not Found ");
		}
	    }
	    else
	    {
	    	System.out.println("\n Not Able to Withdraw ");
	    	System.out.println(" Number of Opened Account in bank : "+0);
	    	System.out.println(" First Open Account   \n");
	    }
		
	}
	public static int OpenAccount(Account[] arr,int index)
	{
		System.out.println(" Enter Account Type ");
		System.out.println("1.Saving Account ");
		System.out.println("2.Current Account ");
		System.out.println("3.Salary Account ");
		System.out.println("4.Loan Account ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		
		if(type==1)
		{
			//public Saving_Account(String acc_h,int acc_no,int bal)
			
			
			System.out.println("You Entered Saving Account ");
			System.out.println("Enter Account Holder Name : ");
			String name = sc.next();
			System.out.println("Enter Account number : ");
			int acc_no = sc.nextInt();
			System.out.println("Enter Account balence : should greater than 10,000 ");
			int bal = sc.nextInt();
			
			if(bal>=10000)
			{
				if(index!=10)
				{
				  arr[index] = new Saving_Account(name,acc_no,bal);
				  index++;
				}
			}
			else
			{
				System.out.println(" Amount is less than 10,000. Your not able to Open Saving Account ");
			}
			
			System.out.println(" Account Successfully Opened !! ");
			System.out.println(" 1.See detail of Account ");
			int d = sc.nextInt();
			
			if(d==1)
			{
				arr[index-1].display();
			}
			
			
		}
		else if(type==2)
		{
			//public Current_Account(String bank_hol, int acc_no,int bal )
			System.out.println("You Entered Current Account ");
			System.out.println("Enter Account Holder Name : ");
			String name = sc.next();
			System.out.println("Enter Account number : ");
			int acc_no = sc.nextInt();
			System.out.println("Enter Account balence : ");
			int bal = sc.nextInt();
			if(index!=10)
			{
			arr[index] = new Current_Account(name,acc_no,bal);
			index++;
			}
			
			System.out.println(" Account Successfully Opened !! ");
			System.out.println(" 1.See detail of Account ");
			int d = sc.nextInt();
			
			if(d==1)
			{
				arr[index-1].display();
			}
			
		}else if(type==3)
		{
			System.out.println("You Entered Salary Account ");
			System.out.println("Enter Account Holder Name : ");
			String name = sc.next();
			System.out.println("Enter Account number : ");
			int acc_no = sc.nextInt();
			System.out.println("Enter Account balence : ");
			int bal = sc.nextInt();
			//public Salary_Account(String acc_h, int acc_no, int bal,int date)
			int date = date();
			
			if(index!=10)
			{
			arr[index] = new Salary_Account(name,acc_no,bal,date);
			index++;
			}
			
			System.out.println(" Account Successfully Opened !! ");
			System.out.println(" 1.See detail of Account ");
			int d = sc.nextInt();
			
			if(d==1)
			{
				arr[index-1].display();
			}
			
			
		}
		else if(type==4)
		{
			//public Loan_Account(String acc_h, int acc_no, int bal, int emi)
			System.out.println("You Entered Loan Account ");
			System.out.println("Enter Account Holder Name : ");
			String name = sc.next();
			System.out.println("Enter Account number : ");
			int acc_no = sc.nextInt();
			System.out.println("Enter Loan Amount  : ");
			int bal = sc.nextInt();
			System.out.println("Enter Number of Emi  : ");
			int emi = sc.nextInt();
			
			if(index!=10)
			{
			 arr[index] = new Loan_Account(name,acc_no,bal,emi);
			 index++;
			}
			
			System.out.println(" Account Successfully Opened !! ");
			System.out.println(" 1.See detail of Account ");
			int d = sc.nextInt();
			
			if(d==1)
			{
				arr[index-1].display();
			}
		}
		
		return index;
	}
	
	public static int date()
	{
		int date = 0;
		System.out.println(" Enter date in yyyy-mm-dd format ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		LocalDate d = LocalDate.parse(s);
		int day = d.getDayOfMonth();
		int month = d.getMonthValue();
		int year = d.getYear();
		
		date = day+month+year;
		
		return date;
	}

}
