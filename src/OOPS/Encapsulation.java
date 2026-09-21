package OOPS;

public class Encapsulation {
//    //Encapsulation
//    public int id;
//    public String name;
//    private int age;

    //perfect encapsulation
    private int id;
    private String name;
    private int age;

    //constructor
    public Encapsulation(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //methods

    public void getFullName(){
        System.out.println(this.name);
    }
    public void setName(String name){
        this.name = name;
        getFullName();
    }
    public void  getId() {
        System.out.println(this.id);
    }
    private void getAge(){
        System.out.println(this.age);
    }



}
