/*In a company, worker efficiency is determined on the basis of the time required for a worker 
to complete a particular job. If the time taken by the worker is between 2 – 3 hours, then the
worker is said to be highly efficient. If the time required by the worker is between 3 – 4 ours, 
then the worker is ordered to improve speed. If the time taken is between 4 – 5 hours, the
worker is given training to improve his speed, and if the time taken by the worker is more than 
5 hours, then the worker has to leave the company. If the time taken by the worker is input
through the keyboard, find the efficiency of the worker.*/

package javaapplication1;

import java.util.Scanner;

public class worker {
     public static void main(String ar[]){
         float hour;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the number of hours taken by the worker to complete his job");
         hour=s.nextFloat();
         if(hour>=2 && hour<=3)
             System.out.println("the worker is highly efficient");
         else if(hour>3 && hour<=4)
             System.out.println("the worker needs to improve speed");
         else if(hour>4 && hour<=5)
             System.out.println("give training to worker to improve speed");
         else if(hour>5)
             System.out.println("the worker is terminated");
     }
}