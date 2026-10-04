package DSA.Array;

import java.util.HashMap;

public class Q12 {
    //identify  high and low frequency item in array
    static void printMaxMin(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int maxFreq=Integer.MIN_VALUE;
        int maxVal=Integer.MIN_VALUE;
        int minFreq=Integer.MAX_VALUE;
        int minVal=Integer.MAX_VALUE;
        for (int key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                maxVal=key;
            }
            if(map.get(key)<minFreq){
                minFreq=map.get(key);
                minVal=key;
            }
        }
        System.out.println("Max frequency item is "+maxVal);
        System.out.println("Min frequency item is "+minVal);
    }

    static void main(String[] args) {
        int[] arr={2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        printMaxMin(arr);
    }
}
