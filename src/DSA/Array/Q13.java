package DSA.Array;

public class Q13 {
    //swap 0 and 1 in ascending order
    static  int[] short01(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0&&arr[j]==0){
                i++;
            }else if(arr[i]==1&&arr[j]==1){
                j--;
            } else {
                if (arr[i] != 0 || arr[j] != 1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j--;
            }
        }
        return arr;
    }

    static void main(String[] args) {
        int[] arr={1,0,0,1,0,1};
        int[] result=short01(arr);
        System.out.println("The modified array is : ");
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
