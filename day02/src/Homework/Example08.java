package Homework;

import java.util.Scanner;

public class Example08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        
        int hundred = num / 100;   // 자바에서 정수끼리의 나눗셈은 소수점을 버리고 몫만 남습니다.    
        int ten = (num % 100) / 10;  // num에 저장된 숫자를 100으로 연산하여 나머지를 구하고 다시 10으로 나누어 몫만 남기면 십의 자리 수가 변수에 저장
        int one = num % 10; // num에 저장된 수를 10으로 나누어 나머지를 저장한다            

        int sum = hundred + ten + one; // 각 구한 숫자를 sum에 저장한다

        System.out.println("각 자릿수의 합 = " + sum);

        
    }

}
