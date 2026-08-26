package Homework;

public class Example05 {

    public static void main(String[] args) {
        
        char c = 'a';

        
        char upperC = (char) (c + ((int) 'A' - (int) 'a'));

        System.out.println("변환된 대문자 : " + upperC);
    }

}