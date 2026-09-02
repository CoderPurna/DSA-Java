package String;

public class StringComparing {
    static void main(String[] args) {
        String name1 = "abc";
        String name2 = "ABC";
        boolean result;

        //comparing with " == "
        //its chack the reference address if same return true if not return false
        result = name1 == name2;
        System.out.println(result);

        //comparing with .equeal()
        //its chack the actual char literals But it case-sensitive("Love" = "LOVE" ans false)
        result = name1.equals(name2);
        System.out.println(result);

        //comparing with .equalsIgnoreCase but it not case-sensitive("Love" = "LOVE" ans True )

        result = name1.equalsIgnoreCase(name2);
        System.out.println(result);

    }
}
