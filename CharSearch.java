package javaapplication1;

import java.util.Scanner;

public class searchChar {
     public static void main(String ar[]){
      Scanner s=new Scanner(System.in);
      int i,n;
      char c;
      char character[]=new char[100];
      System.out.println("enter the size of an array");
      n=s.nextInt();
      System.out.println("enter the characters");
      for(i=0;i<n;i++){
           character[i]=s.next().charAt(0);
      }
       System.out.println("enter the character to be searched");
         c=s.next().charAt(0);
         for(i=0;i<n;i++)
            if(character[i]==c){
             System.out.println("THE INDEX OF "+c+" is "+i);
            }
    }
}
