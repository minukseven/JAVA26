package Person;

public class Student extends Person {
    // 자식만의 필드: 학번
    private int studentId;

    // 생성자: 부모가 요구하는 이름/나이와, 내 것인 학번까지 총 3개를 받습니다.
    public Student(String name, int age, int studentId) {
        super(name, age); // 부모(Person)에게 이름과 나이를 먼저 넘겨서 세팅합니다.
        this.studentId = studentId; // 내 것(학번)은 내가 세팅합니다.
    }

    // 학생의 접근자
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    // 부모의 show()를 덮어씁니다(오버라이딩). 
    // 부모의 변수가 private이므로 getName(), getAge()를 통해 값을 가져옵니다.
    @Override
    public String show() {
        return "학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + studentId + "]";
    }
}