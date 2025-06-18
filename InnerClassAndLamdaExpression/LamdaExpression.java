package InnerClassAndLamdaExpression;

//There are three types of lambda expression 1-No parameter()->{ body   }   2-One Parameter p1->{   BODY   }  3-(p1,p2)->{   BODY    }


interface Car{
    public void drive(int avg,int topSpeed);
}


public class LamdaExpression {
    public static void main(String[] args) {
        Car obj=(avg, topSpped)-> System.out.println("Driving the car.... at average speed of "+avg+" and top speed "+topSpped);
        obj.drive(23,100);
    };

}
//Car obj=(avg,50)->sout(age,topSpeed); obj.drive(18,140)