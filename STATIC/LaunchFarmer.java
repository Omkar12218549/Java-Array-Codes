package STATIC;

import java.util.Scanner;

class Farmer{
     int pa;
     float td;
    static float ri=4.5f;
     float si;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the amount of loan: ");
        pa= sc.nextInt();
        System.out.println("ENter the duration: ");
        td= sc.nextInt();
    }
    void comput(){
        si=(pa*td*ri)/100f;
    }
    void display(){
        System.out.println("SI is: "+si);
    }
}
public class LaunchFarmer {
    public static void main(String[] args) {
        Farmer F1=new Farmer();
        Farmer F2=new Farmer();
        F1.input();
        F1.comput();
        F1.display();
    }
}
