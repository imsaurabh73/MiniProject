package com.braindatawire.minibankproject.client;

import java.util.Scanner;

import com.braindatawire.minibankproject.serviceimpl.SBI;

public class Operation {
  
	
	   public static void main(String[] args)
	   {
		  
		  System.out.println("1-createaccount,2-Depositemoney, 3-Withdrawlmoney, 4-Showaccountdetails ");
		  
		    
		  Scanner sc=new Scanner(System.in);
		 
		   SBI s=new SBI();
		   
		  
		 while(true) {
			 System.out.println("Enter your choice=");
			 int ch=sc.nextInt();
			 
		   switch(ch)
		   {
		   case 1:
		   s.CreateAccount();
			 break;
			 
		   case 2:
		   s.DepositeMoney();
		     break;
		     
		   case 3:
	    s.WithdrwlMoney();
	         break;
	         
		   case 4:
	    s.ShowAllDetails();		   
			   
		   case 5:
			 System.exit(0);  
			   
		     
		   }
		   
		   
		  
			   
		 }

	   } 
	
}
