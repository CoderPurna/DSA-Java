package OOPS;

public class App {
    static void main(String[] args) {
        /*
        Student A = new Student();

        //set the value
        A.name="Purna";
        A.id=1;
        A.age=10;
        A.NOS=5;

        //Print the value
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.NOS);

        //Call the Attribute
        A.Bunk();
        A.Study();
        A.Sleep();

        System.out.println();

        //Parameterized Call
        Student B = new Student(2,"Purna",15,5);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.NOS);
        B.Bunk();
        B.Study();
        B.Sleep();
        System.out.println();

        //Copy Constructor
        Student C = new Student(A);
        System.out.println(C.name);
        System.out.println(C.id);
        System.out.println(C.age);
        System.out.println(C.NOS);
        C.Bunk();
        C.Study();
        C.Sleep();
        */

        Encapsulation s = new Encapsulation(1,"Purna",15);

//        System.out.println(s.name);
//        System.out.println(s.id);
//        System.out.println(s.age);//Privet is not accessible

        s.getFullName();
        s.getId();
        s.setName("Rahul");
//        s.getAge();//Privet Method is not accessible

    }
}
