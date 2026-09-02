package Arrays;

import java.util.Scanner;

public class Arrray2DWithUserData {
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
        System.out.println("Printing the 2D array:");
        for(int i = 0; i <array.length; i++) {
            for(int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
