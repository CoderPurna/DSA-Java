package DSA;

public class Q6 {
    //unsorted element in array
    static int unShortedElement (int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,4,6,8};
        System.out.println(unShortedElement(arr));

    }
}
