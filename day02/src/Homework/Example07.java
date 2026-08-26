package Homework;

import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        
        boolean cond1 = (x % 4 == 0) && (x % 5 == 0);
        
        // AND 연산자(&&): 두 조건이 모두 참일 때만 true를 반환합니다
        
        boolean cond2 = (x % 4 == 0) || (x % 5 == 0);
        
        // OR 연산자(||): 두 조건 중 하나라도 참이면 true를 반환합니다.
        
        boolean cond3 = (x % 4 == 0) ^ (x % 5 == 0);
        
        // XOR 연산자(^): 두 조건의 결과가 서로 다를 때만 true를 반환합니다.

        System.out.println("4와 5로 나누어지는가? " + cond1);
        System.out.println("4 또는 5로 나누어지는가? " + cond2);
        System.out.println("4나 5 중 하나로만 나누어지는가? " + cond3);

        
    }

}
