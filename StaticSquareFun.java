import java.util.*;

class Square{
	static int number(int x){
	return x*x;
	
} 
}

class Ques2{
public static void main(String args[]){
	Scanner inp = new Scanner(System.in);
 	int a = inp.nextInt();
	int x = Square.number(a);
	System.out.println(x);
}
}