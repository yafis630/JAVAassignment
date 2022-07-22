/*you have saved $500 to use as a down payment on a car. Before beginning your car shopping, 
you decide to write a program to help you figure out what your monthly payment will be, 
given the car’s purchase price, the monthly interest rate, and the time period over which you
will pay back the loan. The formula for calculating your payment is:
payment= i*p / 1 - ( 1 + i )^-n
Where
P = principal (the amount you borrow)
i = monthly interest rate (1/12 of the annual rate)
n = total number of payments
Your program should prompt the user for the purchase price, the down payment, the annual interest 
rate, and the total number of payments (usually 36, 48, or 60). It should then display the amount 
borrowed and the monthly payment including a dollar sign and two decimal places.*/

package javaapplication1;
import static java.lang.Math.*;
import java.util.*;

public class Loan {
    public static void main(String a[]){
        float intrest,pp,dp,p,payement,minintrest;
        int nop;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the purchase price");
        pp=s.nextFloat();
        System.out.println("enter the down payement");
        dp=s.nextFloat();
        System.out.println("enter the annual intrest rate");
        intrest=s.nextFloat();
        System.out.println("enter the number of payements");
        nop=s.nextInt();
        p=pp-dp;
        intrest=intrest/100;
        minintrest=intrest/12;
        payement=(float) ((minintrest*p)/(1-pow((1+minintrest),(-nop))));
        System.out.println("ammount borrowed="+p);
        System.out.printf("monthly payement =₹ %.2f",payement);
    }
}
