package com.pankaj.rathod;
public abstract class Account {

	   String Acc_holder_name;
	   int Acc_number;
	   int balence;
	
	abstract void deposit(int a);
	   abstract void withdraw(int a);
	   abstract void display();
	   
}
