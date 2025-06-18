package OPPSPWSKILLS;

//Create a multilevel inheritance structure where Vehicle is the base class,
// Car extends Vehicle, and SportsCar extends Car. Each class should have a method that prints a message.

class vehicle{
    public void message(){
        System.out.println("This is base class");
    }
}
class Car extends vehicle{
    public void accelerate(){
        System.out.println("this is Car claasss");
    }
}
class SportsCar extends Car{
    public void turboboost(){
        System.out.println("This is Sportscar class");
    }
}
public class Multilevelinheri {
    public static void main(String[] args) {
        SportsCar obj=new SportsCar();
        obj.message();
        obj.accelerate();
        obj.turboboost();
    }
}
