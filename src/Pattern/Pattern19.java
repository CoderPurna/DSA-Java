package Pattern;

public class Pattern19 {
    static void main() {
        int n = 4;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            int decRowValue = row - 1;
            for(int col = 1; col <= row-1; col++) {
                System.out.print(decRowValue+" ");
                decRowValue--;
            }
            System.out.println();

        }

    }
}
