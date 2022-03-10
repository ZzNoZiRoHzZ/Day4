package Lession4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input N: ");
		int myNumN2 = scanner.nextInt();

		uocSoLe(myNumN2);
		System.out.println();
	}
	public static void uocSoLe(int a) {
		System.out.println("Uoc so le cua " + a + ": ");
		int maxSoLe = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i % 2 != 0) {
				if(i>maxSoLe) {
				maxSoLe= i;
				}
			}
		}
		System.out.println(maxSoLe);
	}
}
