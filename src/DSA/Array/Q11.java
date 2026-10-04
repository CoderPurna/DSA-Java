package DSA.Array;

import java.util.HashMap;

public class Q11 {
    //Find the Mode (Highest frequency)
    static int getMode(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        //chack the key set
        for(int key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        int maxFreq=-1;
        int maxValue=-1;
        for(int key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                maxValue=key;
            }

        }
        return maxValue;
    }

    static void main(String[] args) {
        int[] arr={5,6,7,7,8,1,5,9,1};
        System.out.println("Max frequency item is "+getMode(arr));
    }
}
