package Homework;

import java.util.Scanner;

public class Example03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        double r = sc.nextDouble();

        System.out.print("원기둥의 높이는? ");
        double h = sc.nextDouble();

        double volume = r * r * 3.14 * h;

        System.out.println("원기둥의 부피는 " + volume);

        
    }

}
