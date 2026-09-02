package Arrays;

import java.util.Scanner;

public class ArrayQ3 {
    static void main(String[] args) {
        // Max and Min element of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int min = arr[0];
        for(int value: arr) {
            if(value>max){
                max=value;
            }
            if(value<min){
                min=value;
            }
        }

        System.out.println("The max elements in the array is:" + max);
        System.out.println("The min elements in the array is:" + min);
    }
}
