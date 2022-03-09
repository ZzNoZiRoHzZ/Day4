package Lession4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num, digit, total = 0;
		System.out.print("Input Number:");
		num = scanner.nextInt();
		while (num > 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				total = total + digit;
			} 
			num=num/10;
		}
		System.out.println("Tong cac so chan trong so nay: " + total);
	}
}
