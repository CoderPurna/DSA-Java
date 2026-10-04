package DSA.Array;

public class Q7 {

    //Revers an array
    //Tow pointer Problem
    static  int[] reversArray(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    static void main(String[] args) {
        int [] arr ={5,8,9,4,6,3};
        int [] result =reversArray(arr);
        System.out.println("New Reversed Array is : ");
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
