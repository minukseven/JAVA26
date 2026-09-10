package programing;

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print(); // 출력: 7번 아이언입니다.

        GolfClub g2 = new GolfClub(8);
        g2.print(); // 출력: 8번 아이언입니다.

        GolfClub g3 = new GolfClub("퍼터");
        g3.print(); // 출력: 퍼터입니다.
    }
}