package betty.simplecalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Calculator");
		int a, b;
		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		MathOperations op = new MathOperations();
		System.out.println("on addition : " + op.add(a, b));
		System.out.println("on subtraction : " + op.subtract(a, b));
	}

}
