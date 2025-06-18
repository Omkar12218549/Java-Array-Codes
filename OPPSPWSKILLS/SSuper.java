package OPPSPWSKILLS;

//How can super be used to access parent class methods and variables? Give an example.

class parents{
    int a;
    parents(int a){
        System.out.println("This is parent class method");
        this.a=a;
        System.out.println("the value of a is: "+a);
    }
}
class derived extends parents{

    derived(){
        super(10);
        System.out.println("this is child class constructor");
    }

}

public class SSuper {
    public static void main(String[] args) {
        derived obj=new derived();
    }


}
