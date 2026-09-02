package Arrays;

import java.util.Scanner;

public class ArrayQ2 {
    static void main(String[] args) {
        //multiply the element of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans =1;
        for(int value: arr) {
            ans *= value;
        }

        System.out.println("The sum of all elements in the array are:" + ans);
    }
}
