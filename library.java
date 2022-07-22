/*A library charges a fine for every book returned late. For first 5 days the fine is 50 paise, for 6-
10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the book after 30 
days your membership will be cancelled. Write a program to accept the number of days the 
member is late to return the book and display the fine or the appropriate message.*/

package javaapplication1;

import java.util.Scanner;

public class library {
     public static void main(String ar[]){
         int days;
         float fine = 0;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of days the member is late");
         days=s.nextInt();
         if(days>0 && days<=5)
             fine=(float) (0.50*days);
         else if(days>=6 && days<=10)
             fine=1*days;
         else if(days>=10 && days<=30)
             fine=5*days;
         else if(days>30)
             System.out.println("library membership cancelled");
         System.out.println("total fine= Rs. "+fine);
     }
}
