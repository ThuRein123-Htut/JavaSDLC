package tr_khin;

import java.util.Scanner;

public class ArrayEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
