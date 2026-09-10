package programing;

public class Car {
    // [1] 필드 선언
    private String color; // 자동차 색상 (각 객체마다 가짐)
    
    // 모든 Car 객체가 공유하는 정적 변수 (static)
    private static int numOfCar = 0;    // 전체 자동차 수
    private static int numOfRedCar = 0; // 빨간색 자동차 수

    // [2] 생성자 : 객체가 생성될 때마다 자동차 개수를 카운트합니다.
    public Car(String color) {
        this.color = color;
        
        // 차가 만들어질 때마다 전체 자동차 수 1 증가
        numOfCar++; 

        // 색상이 "red" 또는 "RED"인 경우 빨간색 자동차 수 1 증가
        if (color.equalsIgnoreCase("red")) {
            numOfRedCar++;
        }
    }

    // [3] static 메서드 (클래스 이름으로 호출하므로 static을 붙여줍니다)
    public static int getNumOfCar() {
        return numOfCar; // 전체 자동차 수 반환
    }

    public static int getNumOfRedCar() {
        return numOfRedCar; // 빨간색 자동차 수 반환
    }
}