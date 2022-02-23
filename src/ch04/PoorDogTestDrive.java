package ch04;

class PoorDog {
    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public  String getName(){
        return name;
    }
}
//위의 인스턴스 변수들을 초기화하는것은 필수는 아니다
//인스턴스 변수 = class 안에 있는 변수들
//클래스 변수 = 인스턴스 변수 앞에 static을 붙인 변수
//지역 변수 = for, while 문과 같이 {} 밖에선 사용할수 없는 변수들

public  class PoorDogTestDrive{
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is "+ one.getName());
    }
}
