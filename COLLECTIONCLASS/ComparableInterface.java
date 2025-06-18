package COLLECTIONCLASS;
// if u want to use comparable then implements in student class and make compare to metthod
import java.util.*;

class Student implements Comparable<Student>{
    int marks;
    int age;
    String name;

    public Student(int marks,int age,String name){
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
    public int compareTo(Student a){
        if(this.marks>a.marks)
            return 1;
        else
            return -1;
    }
}


public class ComparableInterface {
    public static void main(String[] args) {
        Student st1=new Student(87,20,"Omkar yadav");
        Student st2=new Student(77,23,"Alok Singh");
        Student st3=new Student(89,28,"Ambashish Sharma");
        List<Student> list=new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);
        //Collections.sort(list); Here it will give error becoz there is differnt type of data is present so we have to use compareto method by implemnting Comparable interface
//after making compare to function we can use sort method
        Collections.sort(list);
        System.out.println(list);

    }
}
