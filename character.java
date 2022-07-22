/* Any character is entered through the keyboard write a program to determine whether the
character entered is a capital letter, a small case letter, a digit or a special symbol.*/

package javaapplication1;

import java.util.Scanner;

public class character {
public static void main(String ar[]){
    char c;
    Scanner s=new Scanner(System.in);
    System.out.println("enter any character:");
    c=s.next().charAt(0);
    if(c>=65 && c<=90)
    System.out.println(c+" is CAPITAL letter.");
    else if(c>='a'&& c<='z')
    System.out.println(c+" is small letter.");
    else if(c>='0'&& c<='9')
    System.out.println(c+" is numeric character.");
    else
    System.out.println(c+" is special character.");
}    
}
