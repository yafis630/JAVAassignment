/*If the three sides of a triangle are entered through the keyboard, write a program to check 
whether the triangle is valid or not. The triangle is valid if the sum of two sides is
greater than the largest of the three sides*/

package javaapplication1;

import java.util.Scanner;

public class Triangle {
   public static void main(String ar[]){
       int a,b,c,max;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the sides of triangle");
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt(); 
       if(a>b&&a>c)
           max=a;
       else if(b>a&&b>c)
           max=b;
       else
           max=c;
       if(max==a && (b+c)>a ||max==b&& (a+c)>b ||max==c && (b+a)>c)
          System.out.println("Triangle is valid");
       else
           System.out.println("Triangle is not valid");
   }
}