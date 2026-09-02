package Arrays;

public class Array2D {
    static void main(String[] args) {

        //declaration
        int arr [][] ; //or int [][] arr;
        //allocation
        arr = new int [3][3];
        //initialization
        int arr1[][]={
                {1,2},{3,4,8},{5}
        };

        //Print item
        System.out.println(arr1[0][1]);

        //Print entire array
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
