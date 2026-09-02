package String;

public class StringQ2 {
    static void main(String[] args) {
        //count the array length without .length() method
        int count = 0;
        String str1 = "Hello World";

        char[] str2 = str1.toCharArray();
        for(char c : str2){
            count++;
        }

        System.out.println("The leengthe of String "+str1+" is "+count);
    }
}
