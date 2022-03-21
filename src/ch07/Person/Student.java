package ch07.Person;

public class Student extends Person {
    private int grade;
    private int group;
    private int stunum;
    private int record;

    public Student(int grade, int group, int stunum, int record){
        this.grade = grade;
        this.group = group;
        this.stunum = stunum;
        this.record = record;
    }

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
