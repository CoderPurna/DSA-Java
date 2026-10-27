package DSA.Array;

public class twoSum {

    static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                }
            }
        }

        return res;
    }

    static void main(String[] args) {
        int[] arr = {1,3,5,7,4};
        int target = 9;
        int[] res = twoSum(arr, target);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
