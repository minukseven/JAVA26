package grammar;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요 :");
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int val = sc.nextInt();
			sum += val;
		}
		
		System.out.println("5개 숫자의 총합 : " + sum);
	}

}