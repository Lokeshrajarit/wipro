package lokeshraja.java;

import java.util.Scanner;

public class tx2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number 1:");
	int a = sc.nextInt();
	System.out.print("Enter the number 2:");
	int b=sc.nextInt();
    if (a>b)
    {
    	System.out.println(a+" is greater than "+b);
    }
    else 
    	System.out.println(b+" is greater than "+a);
	}

}
