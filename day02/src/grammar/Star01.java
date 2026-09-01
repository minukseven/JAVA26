package grammar;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}