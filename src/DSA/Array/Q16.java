package DSA.Array;

import java.util.HashMap;

public class Q16 {
    //sort 0's 1's 2's
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    static void sort012(int[] arr) {
        // Dutch National Flag Problem

        int n = arr.length;
        int low  = 0;
        int mid = 0;
        int high = n - 1;



        while (mid  <= high) {
            if (arr[mid]== 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr, high, mid);
                high--;
            }
        }
        for (int  i : arr) {
            System.out.print(i +" ");
        }
    }

    static void main(String[] args) {
        int[] arr = {0,1,0,2,2,0,1,0,2};
        sort012(arr);
    }
}
