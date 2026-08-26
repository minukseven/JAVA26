package Homework;

import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        
        boolean cond1 = (x % 4 == 0) && (x % 5 == 0);

        
        boolean cond2 = (x % 4 == 0) || (x % 5 == 0);

        
        boolean cond3 = (x % 4 == 0) ^ (x % 5 == 0);

        System.out.println("4와 5로 나누어지는가? " + cond1);
        System.out.println("4 또는 5로 나누어지는가? " + cond2);
        System.out.println("4나 5 중 하나로만 나누어지는가? " + cond3);

        
    }

}
