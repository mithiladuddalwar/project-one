package Assignment;
import java.util.*;
public class Que1 {//Write a program to calculate the sum of first n natural number.  formula = n(n+1)/2

	public static void main(String[] args) {
	
    System.out.println("enter the nth term \n");
    Scanner s=new Scanner(System.in);
    int n=s. nextInt();
    int ans= n*(n+1)/2;
    System.out.println("sum of 1st "+n);  System.out.println("natural number is " +ans);
	}

}
