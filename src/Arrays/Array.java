package Arrays;

public class Array1 {
    static void main(String[] args) {
        //declaration
        int arr[];
        //allocation
        arr=new int[10];
        //initialization
        int arr1[]={10,20,30};

        System.out.println("Value at 0 index is :" + arr1[0]);

        //print array using loop
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println(  );
        //print array using for each loop
        for(int value: arr1) {
            System.out.print(value+" ");
        }
    }
}
