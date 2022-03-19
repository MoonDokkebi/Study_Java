package ch07;

public class Hoegaarden extends Beer{
    //필드 입력
    String flavor;
    int ABV =6;

    //생성자 입력
    Hoegaarden(String type, String model) {
        super("밀맥주", model);
        this.model = model;
        this.flavor = flavor;
    }
    //생성자 오버로딩
    Hoegaarden(String model, String flavor, int ABV){
        super("밀맥주",model);
        this.model =model;
        this.flavor = flavor;
        this.ABV = ABV;
    }
    public void flavordrink(){
        System.out.println(model + "맥주의 " + flavor + "맛을 마십니다.");
    }
    public String getFlavor(){
        return flavor;
    }
    public int getABV(){
        return ABV;
    }
}
