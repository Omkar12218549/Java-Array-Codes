package InnerClassAndLamdaExpression;

//Anonymous inner class is used to make implementation of the methods of the interface
// to reduce the code we use lamda expression in place of anonymous Iner class

interface Animal{
    void Sleep();
}


public class AnonymousInnerclass {
    public static void main(String[] args) {
        Animal obj=new Animal() {
            public void Sleep(){
                System.out.println("Animals have proper sleep");
            }
        };
        obj.Sleep();
    }
}
