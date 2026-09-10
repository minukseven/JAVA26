package programing;

public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        // 1. isSameLine 메서드로 '길이값' 비교 -> 둘 다 길이가 1이므로 true 출력
        System.out.println(a.isSameLine(b));

        // 2. '==' 연산자로 비교 -> 두 객체의 '메모리 주소'를 비교하므로 false 출력
        System.out.println(a == b);
    }
}