package KunalNi2OOPS;

public class Classs {
    String name;
    int rno;
    float marks=90.0f;

    public static void main(String[] args) {

        Classs obj = new Classs();
        obj.marks=90.89f;
        obj.rno=34;
        obj.name="omkar";
        System.out.println(obj.rno);
        System.out.println(obj.name);
        System.out.println(obj.marks);


    }
}