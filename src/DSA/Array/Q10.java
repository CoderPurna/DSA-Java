package DSA.Array;

public class Q10 {
    //Extreme element alternate manner
    static  void printAlternate (int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.print(arr[i]+" ");
                return;
            }else {
                System.out.print(arr[i]+" ");
                i++;
                System.out.print(arr[j]+" ");
                j--;
            }
        }
    }

    static void main(String[] args) {
        int [] arr={5,6,7,7,8};
        printAlternate(arr);
    }
}
