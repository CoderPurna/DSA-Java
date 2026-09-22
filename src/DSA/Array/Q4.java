package DSA;

public class Q4 {

    //Find the Max Element in the array
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i : arr){
//            if(i>max){
//                max = i;
//            }
            //using Math.max
          max=  Math.max(max,i);
//          max=  Math.min(max,i);
        }
        return max;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,50};
        System.out.println(findMax(arr));
    }
}
