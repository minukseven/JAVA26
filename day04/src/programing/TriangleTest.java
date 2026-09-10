package programing;

public class TriangleTest {
    public static void main(String[] args) {
        // --- 01번 문제 테스트 ---
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea()); // 출력 결과: 25.0

        // --- 02번 문제 테스트 ---
        Triangle t1 = new Triangle(10.0, 5.0); // 넓이 25.0
        Triangle t2 = new Triangle(5.0, 10.0); // 넓이 25.0
        Triangle t3 = new Triangle(8.0, 8.0);   // 넓이 32.0

        // t1과 t2의 넓이가 같은지 비교 (같으므로 true)
        System.out.println(t1.isSameArea(t2));

        // t1과 t3의 넓이가 같은지 비교 (다르므로 false)
        System.out.println(t1.isSameArea(t3));
    }
}