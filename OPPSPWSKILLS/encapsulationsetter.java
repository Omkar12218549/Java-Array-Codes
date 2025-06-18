package OPPSPWSKILLS;
class studentj{
    private String name;
    private int age;
    public void setiData(){
        age=23;
        name="Omkar Yadav";
    }
    public void getiData(){
        System.out.println(name+ age);
    }

}
public class encapsulationsetter {
    public static void main(String[] args) {


        studentj obj = new studentj();
        obj.setiData();
        obj.getiData();
    }
}