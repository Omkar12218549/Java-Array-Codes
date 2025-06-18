package PRACTICEE;

import java.util.Scanner;

public class VehicleEfficiency {
    public static double EfficiencyCalculator(double distance,double fuel){
        return distance/fuel;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the distance in km");
        double distance=sc.nextDouble();
        System.out.println("Enter the volume of fuel in litre");
        double fuel=sc.nextDouble();

        double efficiency=EfficiencyCalculator(distance,fuel);
        System.out.println(efficiency);
        sc.close();
    }
}
