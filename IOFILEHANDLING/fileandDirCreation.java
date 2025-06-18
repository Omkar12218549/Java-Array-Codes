package IOFILEHANDLING;

import java.io.File;

public class fileandDirCreation {

        public static void main(String[] args) { //throws IOException
            File file1=new File("PW1.txt");
            System.out.println(file1.isFile());
            try {
                file1.createNewFile();//to remove the error fromhere we have to use throws Exception
            } catch (Exception e){
                System.out.println("Exception is Handled");
            }
            System.out.println(file1.isFile());

            File dir=new File("JAVA");
            System.out.println(dir.isDirectory());

            dir.mkdir();
            System.out.println(dir.isDirectory());
        }

    }


