package Pattern;

public class Pattern21 {
    static void main(String[] args) {
        int n =4;

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <=n- row; col++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++) {
                int a=col;
                int b='A'-1;
                int ans=a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns+" ");
            }
            int a=row;
            int b='A'-2;
            int ans=a+b;
            char finalAns=(char)ans;
            for(int col = 1; col <=row-1; col++) {
                System.out.print(finalAns+" ");
                finalAns--;
            }
            System.out.println();
        }
    }
}
