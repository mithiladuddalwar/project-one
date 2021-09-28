package Assignment;
import java.util.*;
public class Que3 {//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
	//For example, if the input is 12345, the output should be 54321.

	
	public static void main(String[] args) {
		
Scanner  s=new Scanner(System.in);
System.out.println("enter the num more than 2 digit");
int num=s.nextInt();

System.out.println("before reverse number is "+num);
int rem=0;
 for(;num!=0;num/=10) {
	int r;
  r=num%10;
  rem=rem*10+r;
  
    
 }System.out.println("after reverse number is "+rem);
 
	}

}
