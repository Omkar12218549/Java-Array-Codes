package OPPSPWSKILLS;
interface computer{
    void compileCod();
}
class laptop implements computer{
    public void compileCod(){
        System.out.println("You got five error");
    }
}
class Desktop implements computer{
    public void compileCod(){
        System.out.println("you got 5 error,faster");
    }
}
class Developerr{
    public void buildApp(computer obj){
        System.out.println("Building Application");
        obj.compileCod();
    }
}

public class InterfaceImportant {
    public static void main(String[] args) {
        computer obj=new laptop();
        Developerr dev=new Developerr();
        dev.buildApp(obj);
    }
}
