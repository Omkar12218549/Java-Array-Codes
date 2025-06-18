package OPPSPWSKILLS;
interface X{
    void show();
}
interface Y{
    void ABC();
}
class N implements X,Y{
    public void show(){
        System.out.println("In show method");
    }
    public void ABC(){
        System.out.println("in ABC method");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        N obj=new N();
        obj.ABC();
        obj.show();
    }
}
