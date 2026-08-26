package Homework;

import java.util.Scanner;

public class challenge2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        // 소수점이 없는 정수를 입력받기 위해 int 타입 변수 num을 선언하고, sc.nextInt()를 통해 사용자가 키보드로 입력한 정수 값을 저장합니다.

        
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        // num % 2 == 0이 참(true)이면 "짝수"를 선택하고, 거짓(false)이면 "홀수"를 선택해 result 변수에 담습니다.

        
        System.out.println(result);
        // 조건 연산자를 통해 구해진 문자열 결과("짝수" 또는 "홀수")를 화면에 출력합니다.

        
    }

}
