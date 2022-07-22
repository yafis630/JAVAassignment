/* A university has the following rules for a student to qualify for a degree with A as the main 
subject and B as the subsidiary subject:
a) He should get 55 percent or more in A and 45 percent or more in B.
b) If he gets than 55 percent in A he should get 55 percent or more in B. However, he 
should get at least 45 percent in A.
c) If he gets less than 45 percent in B and 65 percent or more in A he is allowed to 
reappear in an examination in B to qualify.
d) In all other cases he is declared to have failed.
Write a program to receive marks in A and B and Output whether the student has passed, failed 
or is allowed to reappear in B*/

package javaapplication1;

import java.util.Scanner;

public class student {
    public static void main(String ar[]){
        int m1,m2;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks in A and B:");
        m1=s.nextInt();
        m2=s.nextInt();
        if(m1>=55 && m2>=45)
            System.out.println("the student has passed");
        else if(m1>=45 && m1<55 && m2>=55)
            System.out.println("the student has passed");
        else if(m1>=65 && m2<45)
            System.out.println("the student is allowed to reappear in B to qualify.");
        else
            System.out.println("the student has failed");
    }
}
