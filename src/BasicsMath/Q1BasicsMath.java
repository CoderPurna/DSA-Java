package BasicsMath;

import java.util.Scanner;

public class Q1BasicsMath {
    //Print digit of a number
    static void printDigits(int n){
        while(n!=0){
            int digit = n%10;
            System.out.println(digit);
            n=n/10;
        }
    }
    //Print Count of digit in number
    static void printCount(int n){
        int count=0;
        while(n!=0){
            int digit = n%10;
            count++;
            n=n/10;
        }
        System.out.println("The Number count is " +count);
    }
    //Sum of digit of a number
    static void printSum(int n){
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("The Sum is " +sum);
    }
    //Revers a number
    static void printReverse(int n){
        int reverse=0;
        while(n!=0){
            int digit = n%10;
            reverse = (reverse*10)+digit;
            n=n/10;
        }
        System.out.println("The Reverse is " +reverse);
    }
    //Palindrome number or not
    static void isPalindrome(int n){
        int reverse=0;
        int original=n;
        while(n!=0){
            int digit = n%10;
            reverse = (reverse*10)+digit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("The Number is Palindrome");
        }else {
            System.out.println("The Number is not Palindrome");
        }
    }
    //Prime or not
    static void isPrime(int n){
        if(n==1){
            System.out.println("The Number is Prime");
        }else{
           /* for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("The Number is not Prime");
                    return;
                }
            }
            System.out.println("The Number is Prime");
            */
            //Less time complexity
            for (int i=2;i*i<n;i++){
                if(n%i==0){
                    System.out.println("The Number is not Prime");
                    return;
                }
            }
            System.out.println("The Number is Prime");
        }
    }

    //GCD calculation

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printDigits(num);
        printCount(num);
        printSum(num);
        printReverse(num);
        isPalindrome(num);
        isPrime(num);

    }
}
