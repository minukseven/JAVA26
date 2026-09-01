package grammar;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("투입 금액 : ");
		int money = sc.nextInt();
		
		System.out.println("< 동전 개수 >");
		int c500 = money / 500;
		int c100 = (money % 500) / 100;
		
		System.out.println("500원짜리 : " + c500 + "개");
		System.out.println("100원짜리 : " + c100 + "개");
	}

}