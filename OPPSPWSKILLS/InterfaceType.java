package OPPSPWSKILLS;
// there are three types of interface 1-functional interface(one abstract method) 2-normal interface(any nnumber of methods) 3-Marker (no methods)

// we cannot create any other method in interface to create any other method we use default or static keywords


interface OM{
    void show();
    default void display(){
        System.out.println("In display");
    }
    static void config(){
        System.out.println("In config");
    }

}
class MO implements OM{
    public void show(){
        System.out.println("in showw....");
    }
}



public class InterfaceType {
    public static void main(String[] args) {
        OM.config();//we can call it because we do not need to make object of static class
        OM obj=new MO();
        obj.show();
        obj.display();
    }


}
