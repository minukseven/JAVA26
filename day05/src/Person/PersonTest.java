package Person;

public class PersonTest {
    public static void main(String[] args) {
        
        // Person 타입의 배열을 만들고 3종류의 객체를 한 번에 담습니다. (업캐스팅)
        Person[] persons = {
            new Person("길동이", 22),
            new Student("황진이", 23, 100),
            new ForeignStudent("Amy", 30, 200, "U.S.A")
        };

        // 향상된 for문 (for~each문)
        for (Person p : persons) {
            // p.show()는 각 객체에 맞게 오버라이딩된 문자열을 return 하므로, 
            // 그걸 System.out.println() 안에 넣어서 최종적으로 화면에 인쇄합니다.
            System.out.println(p.show()); 
        }
    }
}