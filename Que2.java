package Assignment;
import java.util.*;
public class Que2 {// that prompts the user to input a positive integer. It should then print the multiplication table of that number. 


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer\n");
		int i=  s.nextInt();
		for(int j=1;j<=10;j++) {
			int result= i*j;
			System.out.println(+result);
		}
	}

}
