package javaapplication1;
import java.util.Scanner;
public class addMULmatrix {
 public static void main(String args[])
 {   
 matrix obj=new matrix();
 obj.getMatrix();
 obj.display();
 obj.sumMatrix();
 obj.mulMatrix();
}
}
class matrix{
    int m,i,j;
    int array1[][] = new int[20][20];
    int array2[][] = new int[20][20];
    
    void getMatrix(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows and columns of a matrix");
        m=s.nextInt();
        System.out.println("Input elements of first matrix");
        for (i=0; i<m; i++){
           for (j=0; j<m; j++){
            array1[i][j] = s.nextInt();
           }
        }
        System.out.println("Input the elements of second matrix");
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
             array2[i][j] = s.nextInt();
            }
        } 
    }
    void display(){
         System.out.println("first matrix is:-");
        for (i=0; i<m; i++){
           for (j=0; j<m; j++){
             System.out.print(array1[i][j]+"\t");
           }
            System.out.println();
        }
        System.out.println("second matrix is :-");
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
             System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        } 
    }
    void sumMatrix(){
        int sum[][] = new int[m][m];
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
                sum[i][j] = array1[i][j]+array2[i][j]; 
            }     
        }
        System.out.println("Sum of the matrices:-");
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
    }
 }
    void mulMatrix(){
        int k;
         int mul[][] = new int[m][m];
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
                mul[i][j]=0;
                for(k=0;k<m;k++){
                mul[i][j] =mul[i][j]+array1[i][k]*array2[k][j]; 
                }
            }     
        }
        System.out.println("multiplication of the matrices:-");
        for (i=0; i<m; i++ ){
            for (j=0; j<m; j++){
                System.out.print(mul[i][j]+"\t");
            }
            System.out.println();
      }
    }
} 
