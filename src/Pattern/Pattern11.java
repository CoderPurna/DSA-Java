package Pattern;

public class Pattern11 {
    static void main(String[] args) {
        int m=4;
        int n=m-1;

        //first part
        for (int row=1;row<=m; row++) {
           for (int col=1;col<=m-row;col++) {
               System.out.print("  ");
           }
           if (row==1) {
               System.out.print("* ");
           }else {
               //first print star
               System.out.print("* ");
               // looping space
               for(int col=1;col<=2*row-3;col++) {
                   System.out.print("  ");
               }
               //end star
               System.out.print("* ");
           }
           System.out.println();
        }

        // next part
        for (int row=1;row<=n; row++) {
            for (int col=1;col<=row;col++) {
                System.out.print("  ");
            }
            if (row==n) {
                System.out.print("* ");
            }
            else {
                //first star
                System.out.print("* ");
                //looping space
                for(int col=1;col<=2*n-2*row-1;col++) {
                    System.out.print("  ");
                }
                //last star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
