package IOFILEHANDLING;

import java.io.File;
import java.io.IOException;

public class CountingAndprintingtheNumberofFileinDIR {
    public static void main(String[] args) {
//        File dir=new File("PWJAVA");
//        dir.mkdir();
//
//        System.out.println("The directory is: "+dir.isDirectory());
//
//        File f=new File(dir,"pwskill.txt");
//        try{
//        f.createNewFile();
//        }catch (IOException e){
//            System.out.println("The file is present in:"+e);
//        }
//        System.out.println(f.isFile());
        int count=0;
//        String s="PWJAVA";
        File f=new File("PWJAVA");
        String str[]=f.list();
        for (String name: str){
            count++;
            System.out.println(name+" ");
        }
        System.out.println("The number of present in the given directory is "+count);
    }
}
