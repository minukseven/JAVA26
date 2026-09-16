package Circle2;

//실행 클래스
public class CircleTest {
 
 public static void main(String[] args) {
     
     // 1. 일반 원(Circle) 객체 생성
     // 반지름이 5인 원을 만듭니다.
     Circle c = new Circle(5);
     c.show(); // Circle의 show()가 실행됨
     
     // 2. 색칠된 원(ColoredCircle) 객체 생성
     // 반지름이 10이고 색상이 "빨간색"인 원을 만듭니다.
     ColoredCircle cc = new ColoredCircle(10, "빨간색");
     cc.show(); // ColoredCircle에서 덮어쓴(Overriding) show()가 실행됨
     
 }
}
