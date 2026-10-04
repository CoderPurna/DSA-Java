package DSA.Array;

import java.util.Arrays;
import java.util.Collections;

public class Q9 {
    // finding second-largest  element in Array
    static int secondLargest(Integer[] arr){
        Arrays.sort(arr);  // ascending Order
        for(int i = arr.length-1; i>0; i--){
            if(arr[i] > arr[i-1]&&arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Integer [] arr={5,6,7,7,8};
        System.out.println("The Second Largest Array Element is : "+secondLargest(arr));
    }

}
