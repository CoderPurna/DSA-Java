package DSA.Array;

public class Q8 {
    //Shifted element by 1 position
    static int[] shiftedArray(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        return arr;
    }

    static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] result =shiftedArray(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
