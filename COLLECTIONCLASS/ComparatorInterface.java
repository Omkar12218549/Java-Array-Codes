package COLLECTIONCLASS;
import java.util.*;
class Studentt{
        int marks;
        int age;
        String name;

        public Studentt(int marks,int age,String name){
            this.marks=marks;
            this.age=age;
            this.name=name;
        }
        public int getMarks(){
            return marks;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
        public String toString(){
            return ""+marks+"-"+age+" -"+name;
        }
}
class Alpha implements Comparator<Student>{
    public int compare(Student a,Student b){
        if(a.age>b.age)
            return 1;
        else
            return -1;
    }
}




public class ComparatorInterface {
    public static void main(String[] args) {
        Student st1 = new Student(87, 29, "Omkar yadav");
        Student st2 = new Student(77, 23, "Alok Singh");
        Student st3 = new Student(89, 28, "Ambashish Sharma");
        List<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);
        Alpha a=new Alpha();
        Collections.sort(list,a);
        System.out.println(list);

    }
}
