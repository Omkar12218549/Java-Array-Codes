package OPPSPWSKILLS;
class studenta{
    private String name;
    private int age;

    public void setAge(int age){
        this.age=age;

    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class SettersAndgetters {
    public static void main(String[] args) {


        studenta obj = new studenta();
        obj.setAge(19);
        System.out.println(obj.getAge());
        obj.setName("Shashank");
        System.out.println(obj.getName());

    }
}
