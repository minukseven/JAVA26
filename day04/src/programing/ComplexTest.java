package programing;

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print(); // 출력: 2.0 + 0.0i

        Complex c2 = new Complex(1.5, 2.5);
        c2.print(); // 출력: 1.5 + 2.5i
    }
}
