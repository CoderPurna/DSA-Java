package Pattern;

public class Pattern9 {
    static void main(String[] args) {
        int n =5;
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            if(row==1||row==n){
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("* ");
                }
            }
            else{
                //first print star
                System.out.print("* ");
                //space looping
                for(int col=1;col<=2*row-3;col++){
                    System.out.print("  ");
                }
                //end star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
