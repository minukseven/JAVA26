package Challenge;

public class GirlTest {

    public static void main(String[] args) {
        
        Girl[] girls = { 
            new Girl("갑순이"), 
            new GoodGirl("콩쥐"), 
            new BestGirl("황진이") 
        };

        // 향상된 for문: 배열(girls)에 있는 걸 순서대로 하나씩 꺼내서 g라고 부르며 실행
        for (Girl g : girls) {
            g.show(); 
            // 겉보기엔 똑같은 g.show()지만, 
            // 안에 들어있는 객체(Girl, GoodGirl, BestGirl)에 따라 
            // 덮어쓰기 된 내용이 각자 알아서 똑똑하게 다르게 출력됩니다! (다형성)
        }
    }
}