package OPPSPWSKILLS;


    class Animal{
        public void sound(){
            System.out.println("Animals make sound");
        }
    }
    class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("Dogs Barks");
        }
    }


public class INheritenceOverriding {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.sound();
    }

}