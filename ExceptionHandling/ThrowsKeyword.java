package ExceptionHandling;

class Throws {
    public void A()throws Exception
    {
        B();//then I have to handle the error the here also I use same
    }
    public void B() throws Exception
    {
        int num1=8;
        int num2=0;// if i want to duck the try catch then I use Throws Exception
        int result=num1/num2;
        System.out.println(result);
    }
}
public class ThrowsKeyword{
    public static void main(String[] args) {
        Throws obj=new Throws();
        try {
            obj.A();//then I have to handle the exception here
        }
        catch (Exception e){
            System.out.println("Handlin the exception in main method "+e);
        }
    }
}
