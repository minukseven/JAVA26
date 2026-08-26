package Homework;

public class Example05 {

    public static void main(String[] args) {
        
        char c = 'a'; // 문자 하나를 저장하는 char 타입 변수 c를 선언하고 소문자 'a'로 초기화합니다.

        
        char upperC = (char) (c + ((int) 'A' - (int) 'a'));

        System.out.println("변환된 대문자 : " + upperC); // 변환이 완료된 대문자 변수 upperC의 값('A')을 화면에 출력합니다.
    }

}