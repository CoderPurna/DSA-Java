package OOPS;

class Calculator{

    int add (int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,2,3);
        calc.add(1,2);

    }
}
