package Challenge;

public class Girl {
    // 필드 (이름)
    // protected를 쓰면 Animal 코드에서 기본 필드를 썼던 것처럼 자식 클래스에서 마음대로 쓸 수 있습니다.
    protected String name; 

    // 생성자: 객체가 만들어질 때 처음 한 번 무조건 실행되는 부분입니다.
    // "태어날 때부터 이름을 무조건 가지고 태어나라!" 라고 규칙을 정해준 것입니다.
    public Girl(String name) {
        this.name = name;
    }

    // 메서드 (Animal의 eat이나 sleep 같은 역할)
    public void show() {
        System.out.println(name + "는 자바 초보자이다.");
    }
}
