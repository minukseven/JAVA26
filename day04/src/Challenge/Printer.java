package Challenge; // 작성 중인 클래스가 속한 폴더(패키지) 이름입니다.

public class Printer {
    // [1] 변수 선언 영역 (프린터의 현재 상태를 저장합니다)
    private int numOfPapers; // 종이가 몇 장 남아있는지 저장하는 변수 (숫자)
    private boolean duplex;     // 양면 인쇄 기능이 켜져 있는지 저장하는 변수 (true: 켜짐, false: 꺼짐)

    // [2] 생성자 영역 (프린터 객체를 처음 만들 때 초기값을 설정합니다)
    // 매개변수가 없는 기본 생성자 (기본 상태: 종이 0장, 단면 인쇄)
    public Printer() {
        this.numOfPapers = 0;
        this.duplex = false;
    }

    // 종이 수만 받아서 생성하는 생성자 (02번 문제용)
    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers; // 들어온 종이 수로 초기화
        this.duplex = false;            // 기본은 단면 인쇄로 설정
    }

    // 종이 수와 양면 여부를 모두 받아서 생성하는 생성자 (03번 문제용)
    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers; // 들어온 종이 수로 초기화
        this.duplex = duplex;           // 들어온 양면 설정으로 초기화
    }

    // [3] Getter / Setter 영역 (외부에서 변수 값을 읽거나 변경할 때 사용합니다)
    public boolean getDuplex() {
        return duplex; // 현재 양면 설정 상태를 알려줍니다.
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex; // 외부에서 양면/단면 설정을 바꿀 때 사용합니다.
    }

    public int getNumOfPapers() {
        return numOfPapers; // 현재 남아있는 종이 수를 알려줍니다.
    }

    // [4] print 메서드 (실제 인쇄 동작을 처리하는 가장 핵심적인 부분입니다)
    public void print(int amount) { // amount: 출력하려는 면(페이지) 수
        
        
        // Case A: 양면 인쇄 기능이 켜져 있는 경우 (duplex가 true일 때)
        if (duplex) {
            // [양면 용지 계산법]
            // 양면은 종이 1장에 2면을 출력하므로, 필요한 '종이 장수'를 따로 계산해야 합니다.
            // amount % 2 == 0 은 "출력할 면 수가 짝수인가?"를 물어보는 것입니다.
            int printCount;
            if (amount % 2 == 0) {
                printCount = amount / 2;     // 짝수(예: 24면)면 그냥 2로 나눕니다. (12장 필요)
            } else {
                printCount = amount / 2 + 1; // 홀수(예: 25면)면 2로 나누고 1장을 더해줍니다. (13장 필요)
            }

            // 조건 1: 프린터에 종이가 아예 없는 경우
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다.");
            } 
            // 조건 2: 남은 종이보다 필요한 종이(printCount)가 더 많은 경우
            else if (numOfPapers < printCount) {
                System.out.println("양면으로 모두 출력하려면 용지가 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0; // 가지고 있던 종이를 다 썼으므로 0으로 만듭니다.
            } 
            // 조건 3: 종이가 충분해서 정상적으로 출력되는 경우
            else {
                numOfPapers -= printCount; // 사용한 종이 장수만큼 차감합니다. (numOfPapers = numOfPapers - printCount)
                System.out.println("양면으로 " + printCount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        } 
     
        // Case B: 단면 인쇄인 경우 (duplex가 false일 때)
        else {
            // 단면 인쇄는 1면에 종이 1장이 그대로 필요하므로 amount가 곧 종이 장수입니다.
            
            // 조건 1: 프린터에 종이가 아예 없는 경우
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다.");
            } 
            // 조건 2: 남은 종이보다 출력하려는 매수(amount)가 더 많은 경우
            else if (numOfPapers < amount) {
                // 부족한 장수 = (요청한 장수 - 현재 남은 장수)
                int shortage = amount - numOfPapers; 
                System.out.println("단면으로 모두 출력하려면 용지가 " + shortage + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0; // 가지고 있던 종이를 다 썼으므로 0으로 만듭니다.
            } 
            // 조건 3: 종이가 충분해서 정상적으로 출력되는 경우
            else {
                numOfPapers -= amount; // 출력한 장수만큼 차감합니다.
                System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        }
    }
}