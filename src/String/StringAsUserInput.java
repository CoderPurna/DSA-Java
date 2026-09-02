package String;

import java.util.Scanner;

public class StringAsUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName ;
        String name ;

        System.out.println("Enter your full name:");
        name = sc.nextLine();
        System.out.println("Enter your first name:");
        firstName = sc.next();


        System.out.println("Your First Name: " + firstName);
        System.out.println("Your Full Name: " + name);


    }
}
