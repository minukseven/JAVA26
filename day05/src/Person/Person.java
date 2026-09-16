package Person;

public class Person {
    // 필드: 캡슐화를 위해 private으로 선언합니다.
    private String name;
    private int age;

    // 생성자: 태어날 때 이름과 나이를 무조건 받습니다.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 접근자(Getter/Setter): private 변수를 바깥에서 안전하게 꺼내 쓰기 위한 메서드들입니다.
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // 메서드: 이번에는 직접 인쇄(println)하지 않고, 조립된 '문자열'을 결과로 돌려줍니다(return).
    public String show() {
        return "사람[이름 : " + name + ", 나이 : " + age + "]";
    }
}