package Homework;

import java.util.Scanner;

public class Example09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        int major = sc.nextInt();// 전공 이수 학점을 major 변수에 저장

        System.out.print("교양 이수 학점 : ");
        int general = sc.nextInt(); // 교양 이수 학점을 general 변수에 저장

        System.out.print("일반 이수 학점 : ");
        int elective = sc.nextInt(); // 일반 이수 학점을 elective 변수에 저장

        
        boolean totalCond = (major + general + elective) >= 140;
        // 세 영역 학점의 합이 140 이상인지 비교 연산자(>=)로 검사하여 참(true) 또는 거짓(false)을 변수에 저장합니다.

        
        boolean majorCond = major >= 70; //전공 학점이 70 이상인지 판단합니다.

        
        boolean generalCond = (general >= 30 && elective >= 30) || (general + elective >= 80);
        
        // 교양 30학점 이상 그리고(&&) 일반 30학점 이상인 경우

        // 교양과 일반의 합이 80학점 이상인 경우

        // 위 두 가지 조건 중 하나라도 만족하면(||) 참이 되도록 설정합니다

        
        if (totalCond && majorCond && generalCond) {
            System.out.println("졸업 가능");
        } else {
            System.out.println("졸업 불가능");
        }
        
        // 3가지 조건이 모두 참이면 if문 블록을 실행하여 졸업 가능을 출력하고 만족을 못하면 else문 블록으로 이동해 졸업 불가능을 출력한다.

        
    }

}