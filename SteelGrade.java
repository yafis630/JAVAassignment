/*A certain grade of steel is graded according to the following conditions:
1. Hardness must be greater than 50
2. Carbon content must be less than 0.7
3. Tensile strength must be greater than 5600
The grades are as follows:
Grade is 10 if all three conditions are met
Grade is 9 if conditions (i) and (ii) are met
Grade is 8 if conditions (ii) and (iii) are met
Grade is 7 if conditions (i) and (iii) are met
Grade is 6 if only one condition is met
Grade is 5 if none of the conditions are met
Write a program, which will require the user to give values of hardness, carbon content and
tensile strength of the steel under consideration and output the grade of the steel.*/


package javaapplication1;

import java.util.Scanner;

public class SteelGrade {
  public static void main(String ar[]){
     float hard,ts,cc;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the hardness, carbon content and tensile strength of of the steel");
     hard=s.nextFloat();
     cc=s.nextFloat();
     ts=s.nextFloat();
     if(hard>50 && cc<0.7 && ts>5600)
         System.out.println("grade of steel is 10");
     else if(hard>50 && cc<0.7 && !(ts>5600))
         System.out.println("grade of steel is 9");
     else if(!(hard>50) && cc<0.7 && ts>5600)
         System.out.println("grade of steel is 8");
     else if(hard>50 && !(cc<0.7) && ts>5600)
         System.out.println("grade of steel is 7");
    else if(hard>50 || cc<0.7 || ts>5600 )
         System.out.println("grade of steel is 6");
    else if(!(hard>50) && !(cc<0.7) && !(cc>5600))
         System.out.println("grade of steel is 5");
}
}
