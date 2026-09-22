package DSA;

public class Q3 {
    //Linear search

    static boolean findElement(int[] arr,int element){
        for(int i : arr) if(i == element) return true;
        return false;

    }

    static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,};
        System.out.println(findElement(arr,19));

    }
}
