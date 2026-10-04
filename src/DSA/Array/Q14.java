package DSA.Array;

public class Q14 {
    //finding the messing number
    //using XOR

    static int   messingNumber(int [] arr){
        int xorSum = 0;
        for(int i: arr){
            xorSum = xorSum ^ i;
        }
        int  n = arr.length;
        for(int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    static int findUniq(int[] arr){
        int xorSum = 0;
        for(int i: arr) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    static void main(String[] args) {
        int [] arr = {1,3,0,2,5};
        int [] arr1 = {1,2,2,1,3,4,5,4,5};
        System.out.println(messingNumber(arr));
        System.out.println(findUniq(arr1));
    }
}
