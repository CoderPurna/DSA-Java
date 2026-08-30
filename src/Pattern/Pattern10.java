package Pattern;

public class Pattern10 {
    static void main(String[] args) {
        int m=4;
        int n=3;
        for (int row=1;row<=m;row++){
            for (int col=1;col<=m-row;col++){
                System.out.print("  ");
            }
            for (int col=1;col<=(2*row)-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("  ");
            }
            for (int col=1;col<=(3*n)-(2*row)-2;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
