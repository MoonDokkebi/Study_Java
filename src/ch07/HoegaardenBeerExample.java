package ch07;

public class HoegaardenBeerExample {
    public static void main(String[] args) {

        //호가든 맥주 레몬맛 객체 생성하기
        Hoegaarden holemon = new Hoegaarden("호가든", "레몬", 3);

        //Beer 클래스로부터 상속받은 필드
        System.out.println("타입: " + holemon.getType());
        System.out.println("알콜 도수: " +holemon.getABV());

        //Hogaarden 클래스로부터 상속받은 필드
        System.out.println("맛: " + holemon.getFlavor());

        //Hogaarden 클래스 메서드 호풀
        holemon.flavordrink();

    }
}
