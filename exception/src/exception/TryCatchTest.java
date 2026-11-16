package exception;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class TryCatchTest {

	public static void main(String[] args) {
		System.out.println("========= 프로그램 시작 =========");
		
		arithmeticException();
		IllegalArgumentException();
		NoSuchElementException();
		NullPointerException();

		System.out.println("========= 프로그램 종료 =========");
	}
	
	public static void arithmeticException() {
		int a = 10, b = 0;
		
		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}

	public static void IllegalArgumentException() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("정수를 입력하세요: ");
			String input = scanner.nextLine();
			
			int num = Integer.parseInt(input);
			System.out.println("입력된 값: " + num);
			
		} catch (IllegalArgumentException e) {
			System.out.println("입력값이 정수여야 합니다");
		}
	}

	public static void NoSuchElementException() {
		Scanner scanner = new Scanner("박민욱");
		
		try {
			System.out.println(scanner.next());
			System.out.println(scanner.next());
		} catch (NoSuchElementException e) {
			System.out.println("출력할 값이 없습니다");
		}
	}

	public static void NullPointerException() {
		try {
			String s = null;
			System.out.println(s.length()); 
		} catch (NullPointerException e) {
			System.out.println("값이 비어있습니다");
		}
	}
}