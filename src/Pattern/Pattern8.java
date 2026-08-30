package Pattern;

public class Pattern8 {
    static void main(String[] args) {
        int n=5;
        for (int row=1; row<=n; row++){
            //variable row
            if(row==1||row==2||row==n){
                //loop for print star
                for ( int col=1; col<=row; col++){
                    System.out.print("* ");
                }
            }
            else {
                //print first star
                System.out.print("* ");
                //space looping
                for(int col=1; col<=row-2; col++){
                    System.out.print("  ");
                }
                //print last star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
