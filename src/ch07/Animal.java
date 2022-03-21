package ch07;

public class Animal {
int foot;
    public Animal(int foot){
        this.foot=foot;
    }

    public Animal() {
    }

    public int getFoot(){
        return foot;
    }
    public void setFoot(int foot){
        this.foot =foot;
    }

    public String toString(){
        return "동물[발의개수 :"+ foot+ "}";
    }

}
class Dog extends Animal{
    public Dog(int foot){
        this.setFoot(foot);
    }
    public String toString(){
        return "강아지[발의개수 :"+ foot+ "}";
    }
}
class sample1{
    public static void main(String[] args) {
        Dog d =new Dog(4);
        System.out.println(d);
    }
}

