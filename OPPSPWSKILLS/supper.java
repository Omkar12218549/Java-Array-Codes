package OPPSPWSKILLS;
class parent{
    parent(){
        System.out.println("This is parent class constructor");
    }
}
class child extends parent{
    child(){
this(10);
        System.out.println("Child class constructor");
    }
    child(int x){
        super();
        System.out.println("Child class constructor with parameter");
    }
}
public class supper {
    public static void main(String[] args) {


    child obj=new child();
}}
//This is parent class constructor
//Child class constructor with parameter"
//Child class constructor"