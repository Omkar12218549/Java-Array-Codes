package KunalNi2OOPS;

public class Constructor {



        int rollno;
        String name;
        float marks;

        void greeting() {
            System.out.println("Hello my Name is " + name);
        }

        // Uncommented the changename method for completeness
        // void changename(String newName) {
        //     this.name = newName;
        // }\
    Constructor(Constructor other){
            this.name=other.name;
            this.rollno=other.rollno;
            this.marks=other.marks;
    }



    //  DEFAULT CONSTRUCTOR

        Constructor() {
            this.marks = 90;
            this.name = "Omkar Yadav";
            this.rollno = 16;
        }
       // PARAMETERIZED CONSTRUCTOR
        Constructor(int roll, float number, String naam) {
            this.marks = number;
            this.name = naam;
            this.rollno = roll;
        }

        public static void main(String[] args) {
            Constructor obj = new Constructor();
            Constructor omkar = new Constructor(34, 90, "OMEEE");
            Constructor ALOK=new Constructor(32, 89,"Alokee");
            Constructor random=new Constructor(ALOK);
            System.out.println(random.name);

            obj.greeting();
            System.out.println(obj.rollno);
            System.out.println(obj.name);
            System.out.println(obj.marks);

            omkar.greeting();
            System.out.println(omkar.rollno);
            System.out.println(omkar.name);
            System.out.println(omkar.marks);

            ALOK.greeting();
            System.out.println(ALOK.marks);
            System.out.println(ALOK.rollno);
            System.out.println(ALOK.name);

        }
    }

