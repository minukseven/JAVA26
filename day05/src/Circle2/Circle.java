package Circle2;

//부모 클래스
public class Circle {
 // 필드: 반지름
 int radius; 

 // 생성자: 원이 만들어질 때 무조건 반지름(radius) 값을 받도록 규칙을 정함
 public Circle(int radius) {
     this.radius = radius;
 }

 // 메서드: 원의 정보를 출력
 public void show() {
     System.out.println("반지름이 " + radius + "인 원이다.");
 }
}