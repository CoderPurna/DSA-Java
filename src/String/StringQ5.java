package String;

public class StringQ5 {
    static String Reverse(String str){
        int n = str.length();
        String reverse = "";
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
    static void chackPalindrome(String str){
        String reverse = Reverse(str);
        if(str.equals(reverse)){
            System.out.println("The string "+ str +" is palindrome");
        }
    }

    public static void main(String[] args) {
        //Chack string is palindrome or not
        String str = "MAM";
        chackPalindrome(str);




    }
}
