package programpratice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
     int  num=sc.nextInt();
     int count =0;
     if(num<0)
     {
    	 for (int i=1;i>=num;i++)
    	 {
    		 if(num%i==0)
    			 count++;
    	 }
    	 if(count==2)
    	 {
    		 System.out.println("prime number");
    	 }
    	 else
    	 {
    		 System.out.println("not prime number");
    	 }
     }
     
     else 
     {
    	 System.out.println("Not prime number");
     }
  


	}

}
