package OOPS;

public class Student {
    //Attribute
    public int id;
    public String name;
    public int age;
    public int NOS;

    //default ctor attr- garbage
    public Student(){
        System.out.println("Default Constructor called");
    }

    //Parameterized Constructor
    public Student(int id, String name, int age, int NOS){
        this.id = id;
        this.name = name;
        this.age = age;
        this.NOS = NOS;
        System.out.println("Default Constructor called With Parameters");
    }

    //Copy Constructor
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.NOS = s.NOS;
    }

    //Methods and behavior
    public  void Study(){
        System.out.println(name +" Studying");
    }
    public  void Sleep(){
        System.out.println(name +" Sleeping");
    }
    public  void Bunk(){
        System.out.println(name +" Bunking");
    }
}
