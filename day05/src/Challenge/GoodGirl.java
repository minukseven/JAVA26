package Challenge;

public class GoodGirl extends Girl {
    
    // 부모(Girl) 클래스에서 "이름을 무조건 받아라"라고 규칙(생성자)을 만들었기 때문에,
    // 자식(GoodGirl)도 규칙을 따라 이름을 받아서 부모에게 전달(super)해줘야 합니다.
    public GoodGirl(String name) {
        super(name); // 부모 클래스의 생성자에게 이름을 토스!
    }

    // Animal 코드에서 독수리나 호랑이가 eat()을 자기 방식대로 바꾼 것처럼,
    // 여기서도 show()의 내용을 덮어씁니다. (오버라이딩)
    public void show() {
        System.out.println(name + "는 자바를 잘 안다.");
    }
}
