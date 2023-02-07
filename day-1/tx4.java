package lokeshraja.java;

import java.util.Scanner;

public class tx4 {

	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number 1:");
    int a = sc.nextInt();
    if (a%2==0)
	{ 
		 System.out.println(a+ " is even number ");
	}
    else
		System.out.println(a+ " is odd number ");
}

}
