package ch03;

public class Dog {
    String name;
    public static void main(String[] args) {

        //Dog 객체를 만들고 접근합니다.
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name ="Bart";
        //이번에는 Dog 배열을 만듭니다.
        Dog[] mydogs =new Dog[3];
        //그리고 개를 몇마리 집어넣습니다.
        mydogs[0]= new Dog();
        mydogs[1]= new Dog();
        mydogs[2]= dog1;

        //배열 래퍼런스를 써서 Dog객체에 접근합니다.
        mydogs[0].name = "Fred";
        mydogs[1].name = "Marge";
        //이제 순환문을써서 배열에 들어있는 모든개가 짖도록합니다.
        int x=0;
        while (x<mydogs.length){
            mydogs[x].bark();
            x+=1;
        }


    }
    public void bark(){
        System.out.println(name + "이(가) 왈! 하고 짖습니다.");
    }
    public void eat(){}
    public void chaseCat(){}

}
