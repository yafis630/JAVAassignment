/*An Insurance company follows the following rules to calculate the premium.
(1) If a person’s health is excellent and the person is between 25 and 35 years of age and lives 
in a city and is a male then the premium is Rs. 4 per thousand and his policy amount cannot 
exceed Rs. 2 lakhs.
(2) If a person satisfies all the above conditions except that the sex is female then the premium 
is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh.
(3) If a person’s health is poor and the person is between 25 and 35 years of age and lives in a 
village and is a male then the premium is Rs. 6 per thousand and his policy cannot exceed 
Rs. 10,000.
(4) In all other cases the person is not insured.
Write a program to output whether the person should be insured or not, his/her premium rate 
and maximum amount for which he/she can be insured*/
package javaapplication1;

import java.util.Scanner;

public class insurance {
    public static void main(String ar[]){
         int age;
         char sex,health,area;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the health of a person:");
         health=s.next().charAt(0);
         System.out.println("enter the sex of a person:");
         sex=s.next().charAt(0);
         System.out.println("enter the area from where the person is:");
         area=s.next().charAt(0);
         System.out.println("enter the age of a person:");
         age=s.nextInt();
         if(health=='e' && sex=='m' && area=='c' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate=Rs.4 per 1000 \nmaximum policy ammount= Rs.2 lakh.");
         else if(health=='e' && sex=='f' && area=='c' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate=Rs.3 per 1000 \nmaximum policy ammount=Rs.1 lakh.");
         else if(health=='p' && sex=='m' && area=='v' && age>=25 && age<=35)
             System.out.println("person is insured. \nHis premium rate= Rs.6 per 1000\nmaximum policy ammount= Rs.10,000.");
         else 
           System.out.println("the person is not insured");
    }
}
