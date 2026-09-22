package DSA;

public class Q2 {
    //Multiply each element with 10 in array
    static int [] multiplyBy10(int [] arr) {
        int [] result = new int [arr.length];
        for(int i=0; i<arr.length; i++) {
            result[i] = arr[i]*10;
        }
        return result;

    }
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int [] result = multiplyBy10(arr);
        System.out.println("Printing new array:");
        for(int i : result) System.out.print(i+" ");


    }
}
