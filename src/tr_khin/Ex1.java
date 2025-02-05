package tr_khin;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("Positive");
		}
		else if (num < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();

	}

}
