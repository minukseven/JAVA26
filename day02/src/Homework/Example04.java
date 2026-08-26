package Homework;

import java.util.Scanner;

public class Example04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        int totalSeconds = sc.nextInt();
        // 환산할 전체 초를 정수형(int) 변수 totalSeconds에 입력받아 저장합니다.

        int hours = totalSeconds / 3600; // 시간을 구한다.
        int minutes = (totalSeconds % 3600) / 60; // 분을 구한다.
        int seconds = totalSeconds % 60;// 초를 구한다.
        

        System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");
        //계산된 변수들을 문자열 단위("시간", "분", "초") 형태로 출력합니다.

        
    }

}