package Circle2;

//자식 클래스 (Circle을 상속받음)
public class ColoredCircle extends Circle {
 // 자식 클래스만의 새로운 필드: 색상
 String color; 

 // 생성자: 자식 클래스가 태어날 때는 반지름과 색상을 모두 받아야 함
 public ColoredCircle(int radius, String color) {
     // 부모(Circle)가 "반지름을 무조건 내놔라!"라고 규칙(생성자)을 정했기 때문에, 
     // super()를 통해 부모에게 반지름을 먼저 넘겨줍니다.
     super(radius); 
     
     // 색상은 내 것(자식 것)이므로 내가 직접 저장합니다.
     this.color = color; 
 }

 // 메서드 오버라이딩(덮어쓰기)
 // 부모의 show() 메서드를 무시하고 자식만의 방식으로 내용을 바꿔서 출력합니다.
 @Override
 public void show() {
     System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
 }
}