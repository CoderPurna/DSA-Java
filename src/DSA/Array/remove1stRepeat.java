package DSA.Array;

import java.util.HashMap;

public class remove1stRepeat {
    static int  remove1stRepeatItem(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //store frequency
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(int i:map.keySet()){
            if(map.get(i)>1){
                return map.get(i);
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3};
        System.out.println(remove1stRepeatItem(arr));

    }
}
