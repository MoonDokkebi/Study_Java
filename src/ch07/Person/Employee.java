package ch07.Person;

public class Employee extends Person {
    private String company;
    private String rank;
    private String dept;

    public Employee(String name,int age, String company, String rank, String dept){
        this.name = name;
        this.age = age;
        this.company = company;
        this.rank = rank;
        this.dept = dept;
    }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }
    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override public String toString() {
        return "=====직원정보=====\n이름 : " + name +
                " \n나이 : " + age + "세" +
                "\n회사 : " + company +
                " \n직급 : " + rank +
                " \n부서 : " + dept +
                "\n=============="; }
}
