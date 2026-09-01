package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
			System.out.print("계속할까요? (1-계속 / 0-종료) : ");
			int choice = sc.nextInt();
			if (choice == 0) {
				break;
			}
		}
	}

}