package DSA;

public class Q5 {
    static int[] getPosNeg(int[] arr){
        int pos = 0;
        int neg = 0;
        for(int i : arr){
            if(i<0){
                pos +=i;
            }
            else{
                neg +=i;
            }
        }
        return new int[]{pos,neg};
    }

    static void main(String[] args) {
        int[] arr ={1,-2,3,4,-5,6,8};
        int[] ans =getPosNeg(arr);
        for(int i : ans){
            if(i>0){
                System.out.println("The sum of positive integers is "+i);
            }
            else{
                System.out.println("The sum of negative integers is "+i);
            }
        }


    }
}
