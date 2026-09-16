package Person;

public class ForeignStudent extends Student {
    // 손자만의 필드: 국적
    private String nationality;

    // 생성자: 총 4개의 정보를 받아서 세팅합니다.
    public ForeignStudent(String name, int age, int studentId, String nationality) {
        super(name, age, studentId); // 부모(Student)에게 이름, 나이, 학번을 통째로 넘깁니다.
        this.nationality = nationality;
    }

    // 외국학생의 접근자
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    @Override
    public String show() {
        // 부모(Student)의 정보인 학번도 getStudentId()로 가져옵니다.
        return "외국학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getStudentId() + ", 국적 : " + nationality + "]";
    }
}