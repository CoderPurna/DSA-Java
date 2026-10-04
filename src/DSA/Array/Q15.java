package DSA.Array;

public class Q15 {

    // Moving the element by k positions

    static  int [] movingItemAtK(int k, int []arr){
            int n =arr.length;
            k=k%n;
            int [] temp=new int[n];
            for(int i=0;i<n;i++){
                if(i<k){
                    temp[i]=arr[n+i-k];
                }else {
                    temp[i]=arr[i-k];
                }
            }
             for (int i = 0; i < n; i++) {
                 arr[i] = temp[i];
             }
             return arr;
    }

    static void main(String[] args) {
        int[] arr ={5,4,6,8,9};
        int k=2;

        for(int i : movingItemAtK(k,arr)){
            System.out.print(i+" ");
        }
    }
}
