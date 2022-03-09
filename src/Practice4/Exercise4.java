package Practice4;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] agrs) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name:");
		String myName = scanner.nextLine();
		System.out.println("Math Point: ");
		double diemToan = scanner.nextDouble();
		System.out.println("Literature Point: ");
		double diemVan = scanner.nextDouble();
		System.out.println("Biology Point: ");
		double diemSinh = scanner.nextDouble();

		// Câu 1
		diemTB(diemToan, diemVan, diemSinh);

		System.out.println("Medium score " + myName + ": " + diemTB(diemToan, diemVan, diemSinh));

		System.out.println("--------------");
		// Câu 2

		System.out.println("Input number:");
		int myNum1 = scanner.nextInt();

		tinhTongDenN(myNum1);

		System.out.println("Sum from 1 to " + myNum1 + ": " + tinhTongDenN(myNum1));

		System.out.println("--------------");
		// Câu 3

		System.out.println("Input X:");
		int myNumX = scanner.nextInt();
		System.out.println("Input N:");
		int myNumN = scanner.nextInt();

		tinhTongNX(myNumX, myNumN);

		System.out.println("S(" + myNumN + "): " + tinhTongNX(myNumX, myNumN));

		System.out.println("--------------");
		// Câu 4

		System.out.print("Input Number ");
		int myNumN1 = scanner.nextInt();

		if (isPrime(myNumN1)) {
			System.out.println(myNumN1 + " la so nguyen to");
		} else {
			System.out.println(myNumN1 + " khong la so nguyen to");
		}

		System.out.println("--------------");
		// Câu 5

		System.out.println("Cac so nguyen to nho hon " + myNumN1 + ":");

		for (int i = 0; i < myNumN1; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println(".");

		System.out.println("--------------");
		// Câu 6

		System.out.print("Input N: ");
		int myNumN2 = scanner.nextInt();

		uocSoLe(myNumN2);
		System.out.println();

		System.out.println("--------------");
		// Câu 7

		uocSoChan(myNumN2);
		System.out.println();

		System.out.println("--------------");
		// Câu 8

		System.out.print("Input Number");
		int num = scanner.nextInt();
		
		sumSoChan(num);

	}

	public static double diemTB(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	public static int tinhTongDenN(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	public static int tinhTongNX(int a, int b) {
		int sum = 0;
		int expon = 1;
		for (int i = 1; i <= b; i++) {
			expon = expon * a;
			sum += expon;
		}
		;
		return sum;
	}

	public static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void uocSoLe(int a) {
		System.out.println("Uoc so le cua " + a + ": ");
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void uocSoChan(int a) {
		System.out.println("Uoc so chan cua " + a + ": ");
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void sumSoChan(int a) {
		int digit,total=0;
		while (a > 0) {
			digit = a % 10;
			if (digit % 2 == 0) {
				total = total + digit;
			}
			a = a / 10;
		}
		System.out.println("Tong cac so chan trong so nay: " + total);

	}

}
