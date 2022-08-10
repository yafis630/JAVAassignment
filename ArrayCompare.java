package javaapplication1;

import java.util.Scanner;

public class compArray {
     public static void main(String ar[]){
         int arr1[]=new int[20];
         int arr2[]=new int[20];
         int i,n1,n2,count=0;
         Scanner s=new Scanner(System.in);
         System.out.println("enter the size of first array");
         n1=s.nextInt();
         System.out.println("enter the elements of first array");
         for(i=0;i<n1;i++){
             arr1[i]=s.nextInt();
         }
         System.out.println("enter the size of second array");
         n2=s.nextInt();
         System.out.println("enter the elements of second array");
         for(i=0;i<n2;i++){
             arr2[i]=s.nextInt();
         }
          for(i=0;i<n1;i++){
              for(int j=0;j<n2;j++){
                 if(arr1[i]==arr2[j])
                    count++; 
              }
          }
          if(count==n1 && count==n2)
              System.out.println("arrays are equal");
          else
              System.out.println("arrays are not equal");
     }
}
