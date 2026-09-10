package programing;

public class GolfClub {
    // [1] 필드 선언 : 골프채의 이름을 저장할 변수
    private String name;

    // [2] 생성자 오버로딩 (총 3가지)
    
    // 1) 매개변수가 없는 기본 생성자 -> "7번 아이언"으로 설정
    public GolfClub() {
        this.name = "7번 아이언";
    }

    // 2) 숫자를 받는 생성자 -> "X번 아이언"으로 설정
    public GolfClub(int number) {
        this.name = number + "번 아이언";
    }

    // 3) 문자열을 받는 생성자 -> 전달받은 이름("퍼터" 등) 그대로 설정
    public GolfClub(String name) {
        this.name = name;
    }

    // [3] print 메서드 : 출력 형식 "XXX입니다."에 맞게 출력
    public void print() {
        System.out.println(name + "입니다.");
    }
}