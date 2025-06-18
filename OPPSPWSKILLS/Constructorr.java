package OPPSPWSKILLS;


class stud{
    private String name;
    private int age;
    private char grade;

    public stud(String name,int age,char grade){
    this.name=name;
    this.age=age;
    this.grade=grade;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }

}

public class Constructorr {
    public static void main(String[] args) {
        stud objj=new stud("OMKAR",20,'B');
        objj.display();
    }

}
