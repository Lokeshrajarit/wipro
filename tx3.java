package lokeshraja.java;

import java.util.Scanner;

public class tx3 {

	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number 1:");
    int a = sc.nextInt();
    System.out.println("Enter the number 2:");
    int b = sc.nextInt();
    if ((a+b)%2==0)
    { 
    	System.out.println("Even");
    }
    else 
    	System.out.println("odd");
	}

}
