package InnerClassAndLamdaExpression;
class outer{
    public void show(){
        System.out.println("This is a outer class method");
    }
    static class inner{
        public static void innerMethod(){
            System.out.println("This is inner method");
        }
    }
}
public class Inner1 {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.show();
//        outer.inner obj1=obj.new inner(); if the class  is non static
          outer.inner obj1=new outer.inner();// if the classs is static outer.inner ob=new outer.inner
        obj1.innerMethod();
    }
}
