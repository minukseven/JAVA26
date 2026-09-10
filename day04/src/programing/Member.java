package programing;

public class Member {
    // [1] 필드 선언 (외부에서 직접 접근 불가하도록 private 사용)
    private String name;     // 이름
    private String id;       // 아이디
    private String password; // 암호
    private int age;         // 나이

    // [2] 생성자 : 모든 회원 정보를 매개변수로 받아서 객체 생성
    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // [3] 접근자(Getter)와 설정자(Setter)
    // 이름 Getter / Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 아이디 Getter / Setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // 암호 Getter / Setter
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // 나이 Getter / Setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}