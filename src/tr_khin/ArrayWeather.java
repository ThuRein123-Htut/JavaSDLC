package tr_khin;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Participants: ");
		int participants = sc.nextInt();
		int t[] = new int[participants];
		
		int sum = 0;
		for (int i=0;i<participants;i++) {
			System.out.println("Participant 1: " + (i+1));
			t[i] = sc.nextInt();
			sum+=t[i];
		}
		double avg = (double) sum/participants;
		System.out.println("Average: " + avg);
		
		System.out.println("Time(mins): " + Arrays.toString(t));
		Arrays.sort(t);
		
		System.out.println("Lowest: " + t[0]);
		System.out.println("Highest: " + t[t.length-1]);
		
		sc.close();
	}

}
