/**write a program using arrays for sorting an array in ascending and descending order*/

package javaapplication1;

import java.util.Scanner;

public class sortArray {
public static void main(String ar[]){
    sortArrayDemo obj=new sortArrayDemo();
    obj.getArray();
    obj.ascending();
    obj.descending();
  }
}
 class sortArrayDemo {
    int a[]=new int[20];
    int n,i; 
    void getArray(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of an array");
        n=s.nextInt();
        System.out.println("enter the elements of an array");
         for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
    }
    void ascending()
    {
        int temp=0;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(a[i]>a[j]){
                temp=a[i];
               a[i]=a[j];
               a[j]=temp;
            } 
          }
        }
        System.out.println("array in ascending order is:");
        for(i=0;i<n;i++){
             System.out.println(+a[i]);
        }    
  
   }
 void descending()
    {
        int temp=0;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(a[i]<a[j]){
                temp=a[i];
               a[i]=a[j];
               a[j]=temp;
            } 
          }
        }
        System.out.println("array in descending order is:");
        for(i=0;i<n;i++){
             System.out.println(+a[i]);
        }    
  
   }
 }
 
