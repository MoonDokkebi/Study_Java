package ch07.Person;

public class Soldier extends Person {
    private String division;
    private String company;
    private String platoon;
    private int solNum; // 군번
    private String species; // 종과
    public Soldier(String name, int age, String division, String company,String platoon, int solNum,String species){
        this.name = name;
        this.age = age;
        this.division=division;
        this.company=company;
        this.platoon=platoon;
        this.solNum=solNum;
        this.species=species;
}
    public String getDivision(){return division;}
    public void setDivision(String division){this.division=division;}

    public String getCompany(){return company;}
    public void  setCompany(String company){this.company=division;}

    public String getPlatoon(){return platoon;}
    public void  setPlatoon(String platoon){this.platoon=platoon;}

    public int getSolNum(){return solNum;}
    public void setSolNum(int solNum){this.solNum=solNum;}

    public String getSpecies(){return species;}
    public void setSpecies(String species){this.species=species;}

    @Override
    public String toString(){
        return "=====군인정보=====\n이름 : " + name +
                " \n나이 : " + age +
                "세\n군번 : " + solNum + "" +
                " \n사단 : " + division + "" +
                " \n중대 : " + company + "" +
                " \n소대 : " + platoon +
                " \n종과 : " + species +
                "\n==============";
    }
}
