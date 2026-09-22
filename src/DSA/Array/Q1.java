package DSA;

// find the average of array item
public class Q1 {
    static void getAverage(int[] arr) {
        double sum = 0;
        for(int i : arr) {
            sum += i;
        }
        int len = arr.length;
        double avg = sum/len;
        System.out.println("Average is "+avg);

    }

    static void main(String[] args) {
        getAverage(new int[]{1,2,2});
    }
}
