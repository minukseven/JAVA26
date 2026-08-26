package Homework;

import java.util.Scanner;

public class Example09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        int major = sc.nextInt();

        System.out.print("교양 이수 학점 : ");
        int general = sc.nextInt();

        System.out.print("일반 이수 학점 : ");
        int elective = sc.nextInt();

        
        boolean totalCond = (major + general + elective) >= 140;

        
        boolean majorCond = major >= 70;

        
        boolean generalCond = (general >= 30 && elective >= 30) || (general + elective >= 80);

        
        if (totalCond && majorCond && generalCond) {
            System.out.println("졸업 가능");
        } else {
            System.out.println("졸업 불가능");
        }

        
    }

}