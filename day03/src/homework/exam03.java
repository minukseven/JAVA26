package homework;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num <= 0) {
				break;
			}
			
			if (num % 2 == 0) {
				sum += num;
			}
		} while (true);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}