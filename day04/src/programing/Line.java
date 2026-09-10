package programing;

public class Line {
    // [1] 필드 : 직선의 길이
    private int length;

    // [2] 생성자 : 길이를 입력받아 초기화
    public Line(int length) {
        this.length = length;
    }

    // [3] Getter / Setter
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // [4] 동작 : 다른 Line 객체와 길이가 같은지 비교하는 메서드
    public boolean isSameLine(Line line) {
        // 내 길이(this.length)와 상대방 객체의 길이(line.length)가 같은지 확인
        if (this.length == line.length) {
            return true;  // 길이가 같으면 true
        } else {
            return false; // 길이가 다르면 false
        }
    }
}