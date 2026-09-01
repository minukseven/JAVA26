package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val = 0;
		int total = 0;
		
		while (true) {
			System.out.print("숫자 입력 (0 입력 시 종료) : ");
			val = sc.nextInt();
			if (val == 0) {
				break;
			}
			total += val;
		}
		
		System.out.println("입력한 정수의 합 : " + total);
	}

}