package grammar;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		switch (n % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
		case -1:
			System.out.println("홀수입니다.");
			break;
		}
	}

}