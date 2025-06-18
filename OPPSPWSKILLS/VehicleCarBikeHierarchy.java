package OPPSPWSKILLS;
//Question 1: Vehicle-Car-Bike Hierarchy
//Problem Statement:
//Create a Vehicle class with brand and speed attributes.
//
//A Car class should extend Vehicle and have a numberOfDoors attribute.
//A Bike class should extend Vehicle and have a hasGear attribute.
//Implement a display() method in each class to show the details.
class Vehiclee{
    String Brand;
    int speed;
    public Vehiclee(String Brand,int speed){
        this.Brand=Brand;
        this.speed=speed;
    }
    public void display(){
        System.out.println("The brand name of the car is: "+Brand+", the topSpeed of vehicle is: "+speed);

    }
}
class SuperCarrr extends Vehiclee{
    int numberOfDoor;
    public SuperCarrr(String Brand,int speed,int numberOfDoor){
        super(Brand,speed);
        this.numberOfDoor=numberOfDoor;
    }
    public void display(){
        super.display();
        System.out.println("The Number of door present is: "+numberOfDoor);
    }
}
class SuperBikee extends Vehiclee{
    int numberOfgear;
    public SuperBikee(String Brand,int speed,int numberOfgear){
        super(Brand,speed);
        this.numberOfgear=numberOfgear;
    }
    public void display(){
        super.display();
        System.out.println("The number of gear present in the bike is: "+numberOfgear);

    }
}
 class VehicleCarBikeHierarchy {
    public static void main(String[] args) {
        SuperCarrr obj=new SuperCarrr("BMW",200,4);
//        Carrr obj1=new Carrr("Thar",180,4);
        SuperBikee obj2=new SuperBikee("Yamaha",200,6);
        obj.display();
//        obj1.display();
        obj2.display();

    }
}
