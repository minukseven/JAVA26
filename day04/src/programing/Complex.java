package programing;

public class Complex {
    // [1] 필드 선언 (실수부와 허수부)
    private double a; // 실수부
    private double b; // 허수부

    // [2] 생성자 오버로딩
    // 인자가 1개만 들어오는 경우 (예: new Complex(2.0) -> 허수부는 0.0으로 초기화)
    public Complex(double real) {
        this.a = real;
        this.b = 0.0;
    }

    // 인자가 2개 들어오는 경우 (예: new Complex(1.5, 2.5))
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // [3] print 메서드 : 출력 형식 "a + bi" 에 맞추어 출력
    public void print() {
        System.out.println(a + " + " + b + "i");
    }
}