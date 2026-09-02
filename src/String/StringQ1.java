package String;

public class StringQ1 {
    public static void main(String[] args) {
        //print each char of string
        String str = "Hello World";

//        for (int i = 0; i < str.length(); i++) {
//            System.out.println("Char at index "+ i+ " " +str.charAt(i));
//        }

        // Convert the string to a character array
        char [] str1 = str.toCharArray();

        for (char ch : str1) {
            System.out.println(ch);
        }
    }
}
