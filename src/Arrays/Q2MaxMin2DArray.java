package Arrays;

import java.util.Scanner;

public class Q2MaxMin2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the 2D array:");
        int row = sc.nextInt();
        System.out.println("Enter the column of the 2D array:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter the elements of the 2D array:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int max = array[0][0];
        int min = array[0][0];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j <array[i].length; j++) {
                if(array[i][j] > max) max = array[i][j];
                if(array[i][j] < min) min = array[i][j];
            }
        }

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }


}
