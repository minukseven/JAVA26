package programing; // 패키지 이름

public class Triangle {
    // [1] 속성 (필드) : 실수값의 밑변과 높이
    // 외부에서 직접 변경하지 못하게 private으로 설정
    private double a;   // 밑변
    private double b; // 높이

    // [2] 생성자 : 밑변과 높이를 받아서 초기화
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // [3] 접근자 (Getter) : 외부에서 값을 확인할 때 사용
    public double getBase() {
        return a;
    }

    public double getHeight() {
        return b;
    }

    // [4] 동작 (메서드) : 삼각형 넓이 구하기
    // 공식: (밑변 * 높이) / 2
    public double findArea() {
        return (a * b) / 2.0;
    }

    // [02번 추가 문제] 2개의 삼각형 넓이가 같은지 비교하는 메서드
    // t2라는 다른 Triangle 객체를 받아와서 내 넓이와 비교합니다.
    public boolean isSameArea(Triangle t) {
        // 내 넓이(findArea())와 상대방 넓이(t.findArea())가 같은지 확인
        if (this.findArea() == t.findArea()) {
            return true;  // 넓이가 같으면 true
        } else {
            return false; // 넓이가 다르면 false
        }
    }
}