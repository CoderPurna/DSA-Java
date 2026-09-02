package String;

public class StringQ4 {
    public static void main(String[] args) {
        //reverse a string
        String str = "Purna";
        int n = str.length();
        String reverse = "";
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println(reverse);
    }
}
