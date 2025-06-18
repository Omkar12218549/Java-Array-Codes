package NIGHT1;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
//    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }


// Main class

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the method from Animal class

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method from Dog class
    }
}
