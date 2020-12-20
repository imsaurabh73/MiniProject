
package com.braindatawire.minibankproject.serviceimpl;

import com.braindatawire.minibankproject.model.Customer;
import com.braindatawire.minibankproject.servicei.RBI;
import java.util.Scanner;

public class SBI implements RBI{

	Scanner s=new Scanner (System.in);
	Customer c=new Customer();

	public void CreateAccount()
	{
			
			System.out.println("Enter account no=");
	         
			 int accountno=s.nextInt();
			
			 System.out.println("Enter your name=");
				
				 String name=s.next(); 
			
		     System.out.println("Enter your address=");
				
				String address=s.next(); 
			 
		     System.out.println("Enter your aadhar no=");
			
				String aadhar=s.next(); 
				
			System.out.println("Enter your pan no=");
				
				String pan=s.next(); 
			
			System.out.println("Enter your mobile no=");
			    
			    String mobileno=s.next(); 
	
			System.out.println("Enter your gender=");
			
				String gender=s.next(); 
				 	
				 		
			System.out.println("Age=");
			     int age=s.nextInt();
			     
			 System.out.println("Amount=");
			     double amount=s.nextDouble();
			 
		    
			     c.setAccountno(accountno);
					c.setName(name);
					c.getAddress();
					c.setAadhar(aadhar);
					c.setPan(pan);
					c.setMobileno(mobileno);
					c.setGender(gender);
					c.setAge(age);
					c.setAmount(amount);
					
	}
	
	public void ShowBalance()
	{
		   System.out.println(c.getAmount());
	}
    
	public void DepositeMoney()
	{
		   
		   System.out.println("Enter your deposite");
		   double userdeposite1= s.nextInt();
		   
		   double totalamount= c.getAmount()+userdeposite1;
		   c.setAmount(totalamount);
		   System.out.println(totalamount);
    }

	public void WithdrwlMoney() 
	{
		 System.out.println("Withdrwl money=");
		 double Withdrawl=s.nextDouble();
		 
		 double totalamount=c.getAmount()-Withdrawl;
		
		 
	
	}
    
	public void ShowAllDetails()
	{
		System.out.println(c.getAccountno());
		System.out.println(c.getName());
		System.out.println(c.getGender());
		System.out.println(c.getAge());
		System.out.println(c.getAddress());
		System.out.println(c.getAadhar());
		System.out.println(c.getPan());
		System.out.println(c.getMobileno());
		System.out.println(c.getAmount());
	}

}


