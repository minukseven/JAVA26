package Homework;

import java.util.Scanner;

public class Example06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도(F)를 입력하세요 : ");
        double f = sc.nextDouble();

        
        double c = (5.0 / 9.0) * (f - 32);

        System.out.println("섭씨온도(C) : " + c);

        
    }

}
