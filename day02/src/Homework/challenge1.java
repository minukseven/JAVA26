package Homework;

import java.util.Scanner;

public class challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double w, h, area;// 소수점이 포함된 실수를 입력받고 계산하기 위해 double 타입의 변수 3개를 선언합니다.

        
        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        w = sc.nextDouble(); // 사용자가 키보드로 입력한 실수 값을 읽어와 각각 변수 w에 저장합니다.

        
        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        h = sc.nextDouble(); // 사용자가 키보드로 입력한 실수 값을 읽어와 각각 변수 h에 저장합니다.

        
        area = w * h; // 입력받은 가로(w)와 세로(h)의 값을 곱한 뒤, 그 결과값을 area 변수에 할당합니다.

        
        System.out.println("직사각형의 넓이는 " + area + "입니다.");
        // 문자열과 area 변수 값을 + 연산자로 연결하여 문제 요구사항에 맞는 형식으로 최종 결과를 출력합니다.

        
    }

}
