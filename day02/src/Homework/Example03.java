package Homework;

import java.util.Scanner;

public class Example03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        double r = sc.nextDouble();
        // 부피 계산에는 소수점이 포함될 수 있으므로 정수(int)가 아닌 실수형 타입(double) 변수 r(반지름)과 h(높이)를 선언합니다.

        System.out.print("원기둥의 높이는? ");
        double h = sc.nextDouble();

        double volume = r * r * 3.14 * h;
        //문제 조건의 원주율 3.14를 곱해 계산한 결괏값을 실수형 변수 volume에 담습니다.

        System.out.println("원기둥의 부피는 " + volume);
        // 문자열 "원기둥의 부피는 " 뒤에 계산된 volume 변수 값을 + 연산자로 연결해 화면에 출력합니다.

        
    }

}
