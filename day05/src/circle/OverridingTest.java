package circle;


public class OverridingTest {

public static void main(String[] args) {
        System.out.println(">>> 원 : ");
        Clrcle c = new Clrcle(5.0);
        printCircleInfo(new Clrcle(5.0));

        System.out.println(">>> 구(ball) : ");
        Clrcle b = new Ball(5.0);
        printCircleInfo(b);

        System.out.println(">>> 원기둥 : ");
        Clrcle cy = new Cylinder(5.0, 7.0);
        printCircleInfo(cy);
        Cylinder cy2 = (Cylinder)cy;
        System.out.println("높이 : " + cy2.getHeight());
    }

    public static void printCircleInfo(Clrcle c) {
        System.out.println("반지름 : " + c.getRadius());
        System.out.println("면적 : " + c.getArea());
    }
}