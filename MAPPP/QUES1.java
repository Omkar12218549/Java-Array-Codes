package MAPPP;

public class QUES1 {
    public static void main(String[] args) {
        int unit=120;
        int bill=0;
        if(unit<=100){
            bill=unit*2;
        }else if(unit<=200){
            bill=100*2+((unit-100)*3);

        } else if (unit<=400) {
            bill=100*2+100*3+((unit-200)*5);

        }else if(unit<=405){
            bill=100*2+100*3+200*5+((unit-400)*8);
        }
        System.out.println(bill);
    }
}
