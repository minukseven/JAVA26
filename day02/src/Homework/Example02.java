package Homework;

import java.util.Scanner;

public class Example02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt(); // sc.nextInt()는 사용자가 입력한 값을 정수형(int)으로 읽어옵니다. 입력된 숫자가 변수에 저장됨

        System.out.println(num + "의 제곱은 " + (num * num));
        // (num * num) : 변수에 들어있는 값을 두 번 곱해 제곱값을 계산합니다

        
    }

}