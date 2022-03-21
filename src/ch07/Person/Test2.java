package ch07.Person;

public class Test2 {
    public static void main(String[] args) {
        Student s= new Student("홍길동", 33);
        System.out.println(s);

        Soldier sd = new Soldier("군바리",21,"1소대", "1군단","본부중대",202224685,"운전병");
        System.out.println(sd);
        Employee e = new Employee("카카오", 25, "풀스택 개발","김길동", "전무");
        System.out.println(e);
    }
}
