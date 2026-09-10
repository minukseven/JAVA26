package programing;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        // static 메서드는 '클래스이름.메서드이름()' 형태로 호출합니다.
        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d\n",
                Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}